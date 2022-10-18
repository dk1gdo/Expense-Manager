package ru.gariev.expensemanager.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*
import ru.gariev.expensemanager.data.models.*
import java.util.concurrent.Executors

class ExprenseManagerRepository private constructor(context: Context){
    private val database: ExperenseManagerDatabase = Room.databaseBuilder(
        context.applicationContext,
        ExperenseManagerDatabase::class.java,
        DATABASE_NAME
    ).build()
    private val executor = Executors.newSingleThreadExecutor()
    private val expenseManagerDAO = database.experenseManagerDAO()
    fun getAllCurrency() = expenseManagerDAO.getAllCurrency()
    fun getCurrency(id: Int) = expenseManagerDAO.getCurrency(id)
    fun addCurrency(currency: Currency) = executor.execute {
        expenseManagerDAO.addCurrency(currency)
    }
    fun saveCurrency(currency: Currency) = executor.execute {
        expenseManagerDAO.saveCurrency(currency)
    }
    fun deleteCurrency(currency: Currency) = executor.execute {
        expenseManagerDAO.deleteCurrency(currency)
    }

    fun getAllAccountTypes() = expenseManagerDAO.getAllAccountTypes()
    fun getAccountType(id: Int) = expenseManagerDAO.getAccountType(id)
    fun addAccountType(accountType: AccountType) = executor.execute {
        expenseManagerDAO.addAccountType(accountType)
    }

    fun saveAccountType(accountType: AccountType) = executor.execute {
        expenseManagerDAO.saveAccountType(accountType)
    }

    fun deleteAccountType(accountType: AccountType) = executor.execute {
        expenseManagerDAO.deleteAccountType(accountType)
    }

    fun getAllAccount() = expenseManagerDAO.getAllAccount()
    fun getAccount(id: Int) = expenseManagerDAO.getAccount(id)
    fun addAccount(account: Account) = executor.execute {
        expenseManagerDAO.addAccount(account)
    }
    fun saveAccount(account: Account) = executor.execute {
        expenseManagerDAO.saveAccount(account)
    }
    fun deleteAccount(account: Account) = executor.execute {
        expenseManagerDAO.deleteAccount(account)
    }

    fun getAllCostType() = expenseManagerDAO.getAllCostType()
    fun getCostType(id: Int) = expenseManagerDAO.getCostType(id)
    fun addCostType(costType: CostType) = executor.execute {
        expenseManagerDAO.addCostType(costType)
    }

    fun saveCostType(costType: CostType) = executor.execute {
        expenseManagerDAO.saveCostType(costType)
    }

    fun deleteCostType(costType: CostType) = executor.execute {
        expenseManagerDAO.deleteCostType(costType)
    }

    fun getAllCost() = expenseManagerDAO.getAllCost()
    fun getCost(id: Int) = expenseManagerDAO.getCost(id)
    fun addCost(cost: Cost) = executor.execute {
        expenseManagerDAO.addCost(cost)
    }
    fun saveCost(cost: Cost) = executor.execute {
        expenseManagerDAO.saveCost(cost)
    }
    fun deleteCost(cost: Cost) = executor.execute {
        expenseManagerDAO.saveCost(cost)
    }

    companion object {
        private var INSTANCE: ExprenseManagerRepository? = null
        fun initialize(context: Context){
            if (INSTANCE == null) {
                INSTANCE = ExprenseManagerRepository(context)
            }
        }
        fun get():ExprenseManagerRepository {
            return INSTANCE ?:
            throw IllegalMonitorStateException("Repository should be initialized!")
        }
    }
}