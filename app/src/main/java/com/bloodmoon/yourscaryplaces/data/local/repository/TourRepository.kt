package com.bloodmoon.yourscaryplaces.data.local.repository

import com.bloodmoon.yourscaryplaces.data.local.entity.TourDetails
import com.bloodmoon.yourscaryplaces.data.local.entity.TourPreview

class TourRepository() {
    fun getTours(): List<TourPreview> {
        return listOf(
            TourPreview(
                id = 1,
                name = "Ghost “Yenion”",
                imagePath = "file:///android_asset/App2_Image1.jpg",
                stars = 3
            ),
            TourPreview(
                id = 2,
                name = "Destroyed platform",
                imagePath = "file:///android_asset/App2_Image2.jpg",
                stars = 4
            ),
            TourPreview(
                id = 3,
                name = "Gold mine",
                imagePath = "file:///android_asset/App2_Image3.jpg",
                stars = 5
            )
        )
    }

    fun getTourPage(id: Int): TourDetails? {
        return when (id) {
            1 -> TourDetails(
                id = id,
                name = "Ghost “Yenion”",
                imagePath = "file:///android_asset/App2_Image1.jpg",
                stars = 3,
                description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
            )
            2 -> TourDetails(
                id = id,
                name = "Destroyed platform",
                imagePath = "file:///android_asset/App2_Image2.jpg",
                stars = 4,
                description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
            )
            3 -> TourDetails(
                id = id,
                name = "Gold mine",
                imagePath = "file:///android_asset/App2_Image3.jpg",
                stars = 5,
                description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
            )

            else -> null
        }
    }

}