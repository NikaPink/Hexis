package io.github.nikapink.hexis.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import io.github.nikapink.hexis.data.Seance
import io.github.nikapink.hexis.data.SeanceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class SeanceViewModel(private val repository: SeanceRepository) : ViewModel() {
    val allSeance: Flow<List<Seance>> = repository.allSeance

    fun insert(seance : Seance) = viewModelScope.launch {
        repository.insert(seance)
    }

}

class SeanceViewModelFactory(private val repository: SeanceRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SeanceViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SeanceViewModel(repository) as T
        }
        throw IllegalArgumentException("Unkown VIewModel class")
    }
}