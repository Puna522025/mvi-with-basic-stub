package com.androidmvi.spacex.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.androidmvi.spacex.utils.Utilities
import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.com.androidmvi.spacex.ui.R
import com.com.androidmvi.spacex.ui.databinding.RocketLaunchDetailsItemBinding


class RocketLaunchItemViewHolder(
    private val binding: RocketLaunchDetailsItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: GetRocketDetailsDomainModel) {
        val context = itemView.context
        binding.apply {
            missionName.text = context.getString(R.string.mission_name, model.name)
            launchDate.text = context.getString(R.string.launch_date, model.date_utc)
            missionSuccessOrFailed.text = context.getString(R.string.mission_success, model.success.toString())
            Utilities.loadImage(context, patchImage, model.patch)
        }
    }
}