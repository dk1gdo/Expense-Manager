package ru.gariev.expensemanager

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.gariev.expensemanager.data.ExprenseManagerRepository
import ru.gariev.expensemanager.data.models.Cost

class CostListViewModel : ViewModel() {
    private val dbRepository = ExprenseManagerRepository.get()
    val costsLiveData: LiveData<List<Cost>> = dbRepository.getAllCost()
}