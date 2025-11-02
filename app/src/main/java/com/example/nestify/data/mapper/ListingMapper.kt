package com.example.nestify.data.mapper
import com.example.nestify.data.ListingCard
import com.example.nestify.data.ListingDetail
import com.example.nestify.data.ListingDto


fun ListingDto.toListingCard(): ListingCard {
    return ListingCard(
        id = this.id,
        title = this.title,
        category = this.category,
        price = formatPrice(this.price, this.category),
        imageUrl = this.image_url,
        rating = this.rating,
        locationDetail = calculateDistance(this.latitude, this.longitude)

    )
}

fun ListingDto.toListingDetail(): ListingDetail {
    return ListingDetail(
        id = this.id,
        title = this.title,
        category = this.category,
        price = formatPrice(this.price, this.category),
        description = this.description,
        locationDetail = calculateDistance(this.latitude, this.longitude),
        latitude = this.latitude,
        longitude = this.longitude,
        imageUrl = this.image_url,
        contactPhone = this.contact_phone,
        isAvailable = this.is_available,
        rating = this.rating,
        comments = this.comments
    )
}

// Helper functions
private fun formatPrice(raw: Int, category: String): String {
    val formattedNumber = raw
    return when (category) {
        "PG", "Flat" -> "₹ $formattedNumber/mo"
        "Mess" -> "₹ $formattedNumber/day"
        else -> "₹ $formattedNumber" // Fallback for other categories
    }
}

private fun calculateDistance(lat: Double, long: Double): String {
    // Your distance calculation logic
    return "5 min walk from KIET"
}