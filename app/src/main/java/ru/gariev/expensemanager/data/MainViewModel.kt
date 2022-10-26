package ru.gariev.expensemanager.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.gariev.expensemanager.data.models.Cost

class MainViewModel: ViewModel() {
    private val dbRepository = ExprenseManagerRepository.get()
    val costsLiveData: LiveData<List<Cost>> = dbRepository.getAllCost()
}