package com.example.nestify.data

data class ListingDetail(

    val id: Int,
    val title: String,
    val category: String,
    val price: String,              // Formatted
    val description: String,
    val locationDetail: String,     // Calculated from lat/long
    val latitude: Double,           // For map
    val longitude: Double,
    val imageUrl: String,
    val contactPhone: String,
    val isAvailable: Boolean,
    val rating: Double,
    val comments: String,
    val isGuestFavorite: Boolean = false


)
