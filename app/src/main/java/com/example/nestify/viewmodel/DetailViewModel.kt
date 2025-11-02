package com.example.nestify.viewmodel

import ListingRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nestify.data.ListingDetail
import com.example.nestify.data.mapper.toListingDetail

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch



class DetailViewModel(private val repository: ListingRepository) : ViewModel() {
    // For detail screen
    private val _listing = MutableStateFlow<ListingDetail?>(null)
    val listing = _listing.asStateFlow()

    fun loadListing(id: Int) {
        viewModelScope.launch {
            val dto = repository.getListingById(id)
            _listing.value = dto?.toListingDetail()
        }
    }
}