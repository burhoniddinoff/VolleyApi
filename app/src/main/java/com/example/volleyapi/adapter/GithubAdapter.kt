package com.example.volleyapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.volleyapi.databinding.GithubItemBinding
import com.example.volleyapi.model.GithubUser

class GithubAdapter : ListAdapter<GithubUser, GithubAdapter.UserViewHolder>(DiffCallBack()) {
    private class DiffCallBack : DiffUtil.ItemCallback<GithubUser>() {
        override fun areItemsTheSame(oldItem: GithubUser, newItem: GithubUser): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: GithubUser, newItem: GithubUser): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            GithubItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class UserViewHolder(private val binding: GithubItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: GithubUser) {
            binding.apply {
                Glide.with(imageView)
                    .load(user.avatar_url)
                    .into(imageView)
                textLogin.text = user.login
            }
        }
    }
}