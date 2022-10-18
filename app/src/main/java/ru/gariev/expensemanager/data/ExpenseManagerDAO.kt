package ru.gariev.expensemanager.data

import android.provider.BaseColumns
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import ru.gariev.expensemanager.data.models.*

@Dao
interface ExpenseManagerDAO {
    /*Methods for table "currency"*/
    @Query("SELECT * FROM $CURRENCY_TABLE")
    fun getAllCurrency():LiveData<List<Currency>>
    @Query("SELECT * FROM $CURRENCY_TABLE WHERE _id=:id")
    fun getCurrency(id: Int):LiveData<List<Currency>>
    @Insert
    fun addCurrency(currency: Currency)
    @Update
    fun saveCurrency(currency: Currency)
    @Update
    fun deleteCurrency(currency: Currency)

    /*Methods for table accountType*/
    @Query("SELECT * FROM $ACCOUNT_TYPES_TABLE")
    fun getAllAccountTypes():LiveData<List<AccountType>>
    @Query("SELECT * FROM $ACCOUNT_TYPES_TABLE WHERE _id=:id")
    fun getAccountType(id: Int):LiveData<List<AccountType>>
    @Insert
    fun addAccountType(accountType: AccountType)
    @Update
    fun saveAccountType(accountType: AccountType)
    @Delete
    fun deleteAccountType(accountType: AccountType)

    /*Methods for table Account*/
    @Query("SELECT * FROM $ACCOUNT_TABLE")
    fun getAllAccount():LiveData<List<Account>>
    @Query("SELECT * FROM $ACCOUNT_TABLE WHERE _id=:id")
    fun getAccount(id: Int):LiveData<List<Account>>
    @Insert
    fun addAccount(account: Account)
    @Update
    fun saveAccount(account: Account)
    @Delete
    fun deleteAccount(account: Account)

    /*Methods for table costTypes*/
    @Query("SELECT * FROM $COST_TYPES_TABLE")
    fun getAllCostType():LiveData<List<CostType>>
    @Query("SELECT * FROM $COST_TYPES_TABLE WHERE _id=:id")
    fun getCostType(id: Int):LiveData<List<CostType>>
    @Insert
    fun addCostType(costType: CostType)
    @Update
    fun saveCostType(costType: CostType)
    @Delete
    fun deleteCostType(costType: CostType)

    /*Methods for table cost*/
    @Query("SELECT * FROM $COST_TABLE")
    fun getAllCost():LiveData<List<Cost>>
    @Query("SELECT * FROM $COST_TABLE WHERE _id=:id")
    fun getCost(id: Int): LiveData<List<Cost>>
    @Insert
    fun addCost(cost: Cost)
    @Update
    fun saveCost(cost: Cost)
    @Delete
    fun deleteCost(cost: Cost)

}