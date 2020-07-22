package com.arfinrahmat.githubuserapp.model

import com.arfinrahmat.githubuserapp.R

object UsersData {
    private val userNames = arrayOf("JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana")

    private val userFullName = arrayOf("Jake Wharton", "Amit Shekhar", "Romain Guy", "Chris Banes", "David", "Ravi Tamada", "Deny Prasetyo", "Budi Oktaviyan", "Hendi Santika", "Sidiq Permana")

    private val userLocation = arrayOf("Pittsburgh, PA, USA", "New Delhi, India", "California", "Sydney, Australia", "Trondheim, Norway", "India", "Yogyakarta, Indonesia", "Jakarta, Indonesia", "Bandung, Indonesia", "Jakarta Indonesia")

    private val userRepository = arrayOf("102", "37", "9", "30", "56", "28", "44", "110", "1064", "65")

    private val userCompany = arrayOf("Google, Inc.", "MindOrksOpenSource", "Google", "Google working @android", "Working Group Two", "AndroidHive | Droid5", "gojek-engineering", "KotlinID", "JVMDeveloperID", "Nusantara Beta Studio")

    private val userFollowers = arrayOf("56995", "5153", "7972", "14725", "788", "18628", "277", "178", "428", "465")

    private val userFollowing = arrayOf("12", "2", "0", "1", "0", "3", "39", "23", "61", "10")

    private val userImages = intArrayOf(R.drawable.user1, R.drawable.user2, R.drawable.user3,R.drawable.user4, R.drawable.user5, R.drawable.user6, R.drawable.user7, R.drawable.user8, R.drawable.user9, R.drawable.user10)

    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in userNames.indices) {
                val user = User()
                user.username = userNames[position]
                user.fullName = userFullName[position]
                user.location = userLocation[position]
                user.repo = userRepository[position]
                user.company = userCompany[position]
                user.followers = userFollowers[position]
                user.following = userFollowing[position]
                user.photo = userImages[position]
                list.add(user)
            }
            return list
        }

}