package com.androidmvi.spacex.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import com.androidmvi.spacex.ui.adapter.RocketLaunchDetailsAdapter
import com.androidmvi.spacex.ui.base.BaseFragment
import com.androidmvi.spacex.ui.injection.CustomViewModelFactory
import com.androidmvi.spacex.ui.viewmodel.RocketDetailsViewModel
import com.androidmvi.spacex.ui.viewmodel.StateData
import com.com.androidmvi.spacex.ui.R
import com.com.androidmvi.spacex.ui.databinding.RocketDetailsFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RocketDetailsFragment : BaseFragment<RocketDetailsFragmentBinding>() {

    @Inject
    lateinit var customViewModelFactory: CustomViewModelFactory

    private lateinit var rocketDetailsViewModel: RocketDetailsViewModel

    private lateinit var getRocketsDomainModel: GetRocketsDomainModel

    private val rocketLaunchDetailsAdapter: RocketLaunchDetailsAdapter = RocketLaunchDetailsAdapter()

    override fun onCreateViewBinding(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) {
        binding = RocketDetailsFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rocketDetailsViewModel = ViewModelProviders
            .of(this, customViewModelFactory).get(RocketDetailsViewModel::class.java)

        rocketDetailsViewModel.getRocketDetailsViewModelObservable().observe(
            viewLifecycleOwner, processRocketDetails()
        )
        getRocketsDomainModel = requireArguments().getParcelable(BUNDLE_DETAILS)!!

        binding?.apply {
            description.text = getRocketsDomainModel.description
        }

        binding?.recyclerView?.apply {
            adapter = rocketLaunchDetailsAdapter
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }

        rocketDetailsViewModel.getRocketDetails(getRocketsDomainModel.id)
    }

    private fun processRocketDetails(): Observer<StateData<List<GetRocketDetailsDomainModel>>?> =
        Observer {
            if (it != null) {
                when (it.getStatus()) {
                    StateData.DataStatus.LOADING -> {
                        binding?.progressbar?.visibility = View.VISIBLE
                    }
                    StateData.DataStatus.SUCCESS -> {
                        binding?.apply {
                            progressbar.visibility = View.GONE
                            description.visibility = View.VISIBLE
                            errorText.visibility = View.GONE
                            setAdapter(it)
                        }
                    }
                    else -> {
                        binding?.apply {
                            progressbar.visibility = View.GONE
                            errorText.visibility = View.VISIBLE
                            errorText.text = getString(R.string.error_failure_launch_details)
                        }
                    }
                }
            }
        }

    private fun setAdapter(stateData: StateData<List<GetRocketDetailsDomainModel>>?) {
        rocketLaunchDetailsAdapter.setData(stateData?.getData())
    }

    companion object {

        private const val BUNDLE_DETAILS = "BUNDLE_DETAILS"

        fun getInstance(model: GetRocketsDomainModel) = RocketDetailsFragment().apply {
            arguments = Bundle().apply {
                putParcelable(BUNDLE_DETAILS, model)
            }
        }
    }

}