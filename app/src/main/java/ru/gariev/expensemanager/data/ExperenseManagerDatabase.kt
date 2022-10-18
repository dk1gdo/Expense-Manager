package ru.gariev.expensemanager.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import ru.gariev.expensemanager.data.models.Account
import ru.gariev.expensemanager.data.models.AccountType
import ru.gariev.expensemanager.data.models.Cost
import ru.gariev.expensemanager.data.models.CostType
import ru.gariev.expensemanager.data.models.Currency

@Database(
    entities = [
        Account::class,
        AccountType::class,
        Cost::class,
        CostType::class,
        Currency::class
    ]
, version = 1)
@TypeConverters(DatesCoverter::class)
abstract class ExperenseManagerDatabase: RoomDatabase() {
    abstract fun experenseManagerDAO(): ExpenseManagerDAO
}