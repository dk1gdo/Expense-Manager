package ru.gariev.expensemanager

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gariev.expensemanager.data.DatesCoverter
import ru.gariev.expensemanager.data.models.Cost
import ru.gariev.expensemanager.databinding.CostItemBinding

class CostListAdapter(context: Context?, private val costs: List<Cost>)
    : RecyclerView.Adapter<CostListAdapter.CostViewHolder?>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CostViewHolder {
        val binding = CostItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return CostViewHolder(binding)
    }
    override fun getItemCount(): Int = costs.size
    override fun onBindViewHolder(holder: CostViewHolder, position: Int){
        holder.bind(costs[position])
    }
    inner class CostViewHolder(private val binding: CostItemBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(costItem: Cost){
            binding.itemDate.text = DatesCoverter().fromDate(costItem.date)
            binding.itemPrice.text = costItem.price.toString()
        }
    }
}