package com.example.nestify.data

import kotlinx.serialization.Serializable

@Serializable
data class ListingDto(
    val id: Int,
    val title: String,
    val category: String,
    val description:String ,
    val price: Int,         // Raw price (e.g., 6500)
    val latitude: Double,       // Raw GPS
    val longitude: Double,      // Raw GPS
    val image_url: String,
    val contact_phone: String,
    val is_available: Boolean,
    val rating: Double,
    val comments: String


)