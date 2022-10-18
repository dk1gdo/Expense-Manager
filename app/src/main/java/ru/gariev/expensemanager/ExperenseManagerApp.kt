package ru.gariev.expensemanager

import android.app.Application
import ru.gariev.expensemanager.data.ExprenseManagerRepository

class ExperenseManagerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        ExprenseManagerRepository.initialize(this)
    }
}