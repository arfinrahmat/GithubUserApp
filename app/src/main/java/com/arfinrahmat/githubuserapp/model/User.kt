package com.arfinrahmat.githubuserapp.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var username: String="",
    var fullName: String="",
    var location: String="",
    var company: String="",
    var followers: String="",
    var following: String="",
    var repo: String="",
    var photo: Int= 0
) : Parcelable




