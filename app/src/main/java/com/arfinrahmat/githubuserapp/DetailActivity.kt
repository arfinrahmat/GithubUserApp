package com.arfinrahmat.githubuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.arfinrahmat.githubuserapp.model.User
import com.arfinrahmat.githubuserapp.model.UsersData

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDetailPhoto:TextView = findViewById(R.id.tv_name_detail_photo)
        val tvDetailCompany:TextView = findViewById(R.id.tv_detail_company)
        val tvDetailFollowers:TextView = findViewById(R.id.tv_followers_photo)
        val tvDetailFollowing:TextView = findViewById(R.id.tv_following_photo)
        val tvDetailRepository:TextView = findViewById(R.id.tv_repo_photo)
        val imgDetail:ImageView = findViewById(R.id.img_detail_photo)

        val user = intent.getParcelableExtra(EXTRA_USER) as User

        supportActionBar?.title = user.fullName
        tvDetailPhoto.text = user.fullName
        tvDetailCompany.text = user.company
        tvDetailFollowers.text = user.followers
        tvDetailFollowing.text = user.following
        tvDetailRepository.text = user.repo
        imgDetail.setImageResource(user.photo)
    }
}