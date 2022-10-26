package ru.gariev.expensemanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import ru.gariev.expensemanager.databinding.FragmentCostListBinding


class CostListFragment : Fragment() {
    private val viewModel: CostListViewModel by lazy {
        ViewModelProvider(this)[CostListViewModel::class.java]
    }

    private lateinit var binding: FragmentCostListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       /* val view = inflater.inflate(R.layout.fragment_cost_list, container, false)
        if (view is RecyclerView)
            viewModel.costsLiveData.observe(viewLifecycleOwner) {
                view.adapter = CostListAdapter(context, it)
            }
        return view*/
        binding = FragmentCostListBinding.inflate(inflater, container, false)
        if (binding.root is RecyclerView)
            viewModel.costsLiveData.observe(viewLifecycleOwner) {
                binding.root.adapter = CostListAdapter(context, it)
            }
        return binding.root
    }

    companion object {
        fun newInstance() = CostListFragment()
    }
}