package ru.gariev.expensemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.gariev.expensemanager.data.ExprenseManagerRepository
import ru.gariev.expensemanager.data.MainViewModel
import ru.gariev.expensemanager.data.models.*
import ru.gariev.expensemanager.data.models.Currency
import ru.gariev.expensemanager.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val repo = ExprenseManagerRepository.get()

        /*repo.addCurrency(Currency(0, "Рубль", 'Р'))
        repo.addAccountType(AccountType(0, "Банковская карта", "none"))
        repo.addAccount(Account(0, "Карта Мир", 1,1, 1560.03F))
        repo.addCostType(CostType(0, "Продукты"))
        repo.addCost(Cost(0, Date(),"Покупка продуктов на вечер", 1, 1, true))*/

        repo.getAccount(10).observe(this, androidx.lifecycle.Observer {
            it.forEach{
                binding.textView.text = "${it.id}: ${it.title} ${it.currencyId} ${it.accountTypeId} ${it.balance}"
            }
        })
    }
}