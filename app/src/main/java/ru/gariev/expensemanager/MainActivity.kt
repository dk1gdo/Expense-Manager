package ru.gariev.expensemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        /*val rv = binding.recycleView
        if (rv is RecyclerView)
            viewModel.costsLiveData.observe(this) {
                rv.adapter = CostListAdapter(this, it)
                rv.layoutManager = LinearLayoutManager(this)
            }*/
    }
}