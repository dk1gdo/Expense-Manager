package ru.gariev.expensemanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import ru.gariev.expensemanager.data.DatesCoverter
import ru.gariev.expensemanager.data.models.Cost
import ru.gariev.expensemanager.databinding.CostItemBinding
import kotlin.math.cos

class CostListAdapter(context: Context?, private val costs: List<Cost>)
    : RecyclerView.Adapter<CostListAdapter.CostViewHolder?>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CostViewHolder {
        val view: View = layoutInflater.inflate(R.layout.cost_item, parent, false)
        return CostViewHolder(view)
    }

    override fun getItemCount(): Int = costs.size

    override fun onBindViewHolder(holder: CostViewHolder, position: Int){
        holder.bind(costs[position])
    }

    inner class CostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private lateinit var cost: Cost
        private lateinit var binding: CostItemBinding
        fun bind(costItem: Cost){
            binding = CostItemBinding.inflate(layoutInflater)
            cost = costItem
            binding.itemDate.text = DatesCoverter().fromDate(costItem.date)
            binding.itemPrice.text = costItem.price.toString()
        }

    }


}