package ru.gariev.expensemanager.data

import android.provider.BaseColumns
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import ru.gariev.expensemanager.data.models.Currency

@Dao
interface ExpenseManagerDAO {
    /*Methods for table "Currency"*/
    @Query("SELECT * FROM $CURRENCY_TABLE")
    fun getAllCurrency():LiveData<List<Currency>>
    @Query("SELECT * FROM $CURRENCY_TABLE WHERE ${BaseColumns._ID}=:id")
    fun getCurrency(id: Int):LiveData<List<Currency>>
    @Insert
    fun addCurrency(currency: Currency)
    @Update
    fun saveCurrency(currency: Currency)
    @Update
    fun deleteCurrency(currency: Currency)
}