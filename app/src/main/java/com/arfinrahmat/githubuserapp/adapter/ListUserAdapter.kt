package com.arfinrahmat.githubuserapp.adapter

import android.content.Intent
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.arfinrahmat.githubuserapp.DetailActivity
import com.arfinrahmat.githubuserapp.R
import com.arfinrahmat.githubuserapp.model.User
import com.arfinrahmat.githubuserapp.model.UsersData
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_user.view.*

class ListUserAdapter(private val listUser:ArrayList<User>) : RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view:View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_user, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]

        Glide.with(holder.itemView.context)
            .load(user.photo)
            .apply(RequestOptions().override(200,200))
            .into(holder.imgPhoto)

        holder.tvUserName.text = user.username
        holder.tvName.text = user.fullName
        holder.tvLocation.text = user.location
        holder.tvCompany.text = user.company
        holder.tvFollowers.text = user.followers
        holder.tvFollowing.text = user.following
        holder.tvRepo.text = user.repo
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listUser[holder.adapterPosition]) }
        holder.btnDetail.setOnClickListener{
            onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])
            val detailIntent = Intent(holder.btnDetail.context, DetailActivity :: class.java)
            detailIntent.putExtra(DetailActivity.EXTRA_USER, user)
            holder.btnDetail.context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int = listUser.size



    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvUserName: TextView = itemView.findViewById(R.id.tv_item_user_name)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
        var tvCompany: TextView = itemView.findViewById(R.id.tv_item_company)
        var tvFollowers: TextView = itemView.findViewById(R.id.tv_followers_photo)
        var tvFollowing: TextView = itemView.findViewById(R.id.tv_following_photo)
        var tvRepo: TextView = itemView.findViewById(R.id.tv_repo_photo)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail_profile)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: User)
    }
}




