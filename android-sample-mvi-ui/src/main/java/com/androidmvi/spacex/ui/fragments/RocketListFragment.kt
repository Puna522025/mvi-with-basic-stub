package com.androidmvi.spacex.ui.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import com.androidmvi.spacex.ui.adapter.OnRocketClickListener
import com.androidmvi.spacex.ui.adapter.RocketsListAdapter
import com.androidmvi.spacex.ui.base.BaseFragment
import com.androidmvi.spacex.ui.injection.CustomViewModelFactory
import com.androidmvi.spacex.ui.viewmodel.MainStateEvent
import com.androidmvi.spacex.ui.viewmodel.MainViewState
import com.androidmvi.spacex.ui.viewmodel.RocketListViewModel
import com.androidmvi.spacex.ui.viewmodel.StateData
import com.com.androidmvi.spacex.ui.R
import com.com.androidmvi.spacex.ui.databinding.RocketsListFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RocketListFragment : BaseFragment<RocketsListFragmentBinding>(), OnRocketClickListener {

    @Inject
    lateinit var customViewModelFactory: CustomViewModelFactory

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    private lateinit var rocketListViewModel: RocketListViewModel

    private val rocketsListAdapter: RocketsListAdapter = RocketsListAdapter(this)

    override fun onCreateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        binding = RocketsListFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rocketListViewModel = ViewModelProviders
            .of(this, customViewModelFactory).get(RocketListViewModel::class.java)

        rocketListViewModel.viewState.observe(viewLifecycleOwner, processData())

        binding?.recyclerView?.apply {
            adapter = rocketsListAdapter
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }
        setSpinnerDetails()

        rocketListViewModel.handleStateEvent(MainStateEvent.GetRockets)

        binding?.refresh?.setOnClickListener {
            rocketListViewModel.handleStateEvent(MainStateEvent.GetRockets)
        }
    }

    private fun setSpinnerDetails() {
        val status = resources.getStringArray(R.array.rocket_status)
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item, status
        )
        binding?.apply {
            spinner.adapter = adapter
            spinner.setSelection(0, false)
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?, position: Int, id: Long
                ) {
                    rocketListViewModel.filterBasedOnStatus(status[position])
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
    }

    private fun processData(): (StateData<MainViewState>?) -> Unit = {
        if (it != null) {
            when (it.getStatus()) {

                StateData.DataStatus.LOADING -> {
                    binding?.progressbar?.visibility = View.VISIBLE
                }


                StateData.DataStatus.SUCCESS -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.GONE
                    }
                    setAdapterData(it)
                }


                StateData.DataStatus.ERROR -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.VISIBLE
                        //errorText.text = getString(R.string.error_failure)
                        errorText.text = it.getError()?.message
                    }
                }


                else -> {
                    binding?.apply {
                        progressbar.visibility = View.GONE
                        errorText.visibility = View.VISIBLE
                        errorText.text = getString(R.string.error_failure_unknown)
                    }
                }
            }
        }
    }

    private fun setAdapterData(stateData: StateData<MainViewState>) {
        rocketsListAdapter.setData(stateData.getData()?.rockets)
    }

    override fun onRocketClick(model: GetRocketsDomainModel) {
        navigationHandler?.loadFragment(RocketDetailsFragment.getInstance(model), true)
    }

    companion object {
        fun getInstance(): RocketListFragment {
            return RocketListFragment()
        }
    }
}