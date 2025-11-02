package com.example.nestify.viewmodel

import ListingRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nestify.data.ListingCard
import com.example.nestify.data.mapper.toListingCard
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: ListingRepository) : ViewModel() {

    private val _listings = MutableStateFlow<List<ListingCard>>(emptyList())
    val listings = _listings.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage = _errorMessage.asStateFlow()

    init {
        loadListings()
    }

    fun loadListings() {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = null

            try {
                val dtos = repository.getAllListings()
                _listings.value = dtos.map { it.toListingCard() }
            } catch (e: Exception) {
                _errorMessage.value = e.message ?: "Failed to load listings"
                _listings.value = emptyList()
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun clearError() {
        _errorMessage.value = null
    }
}