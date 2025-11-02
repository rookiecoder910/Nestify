package com.example.nestify.data

data class ListingDetail(
    val id: Int,
    val title: String,
    val category: String,
    val price: String,
    val description: String,
    val locationDetail: String,
    val latitude: Double,
    val longitude: Double,
    val imageUrl: String,
    val contactPhone: String,
    val isAvailable: Boolean,
    val rating: Double,
    val comments: String,
    val isGuestFavorite: Boolean = false
)
