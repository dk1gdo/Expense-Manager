package ru.gariev.expensemanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView


class CostListFragment : Fragment() {
    private val viewModel: CostListViewModel by lazy {
        ViewModelProvider(this).get(CostListViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cost_list, container, false)
        if (view is RecyclerView)
            viewModel.costsLiveData.observe(viewLifecycleOwner) {
                view.adapter = CostListAdapter(context, it)
            }
        return view
    }

    companion object {
        fun newInstance() = CostListFragment()
    }
}