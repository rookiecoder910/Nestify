package com.example.nestify.data

data class Listing(
    val id: Int,
    val title: String,
    val category: String, // NEW: "PG", "Flat", or "Mess"
    val price: String,    // Formatted price (e.g., "₹ 6,500/mo" or "₹ 150/day")
    val locationDetail: String, // e.g., "5 min walk from KIET"
    val imageUrl: String,
    val rating: Double = 5.0, // Placeholder rating for MVP
    val isGuestFavorite: Boolean = false // For the badge
)
