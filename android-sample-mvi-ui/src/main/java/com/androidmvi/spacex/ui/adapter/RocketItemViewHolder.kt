package com.androidmvi.spacex.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.androidmvi.spacex.utils.Utilities
import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import com.com.androidmvi.spacex.ui.R
import com.com.androidmvi.spacex.ui.databinding.RocketsListItemBinding

class RocketItemViewHolder(
    private val binding: RocketsListItemBinding,
    private val onRocketClickListener: OnRocketClickListener
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: GetRocketsDomainModel) {
        val context = itemView.context
        binding.apply {
            itemView.setOnClickListener { onRocketClickListener.onRocketClick(model) }
            name.text = context.getString(R.string.list_rocket_name, model.name)
            country.text = context.getString(R.string.list_rocket_country_name, model.country)
            engineCount.text = context.getString(R.string.list_rocket_engine_count, model.engineCount)
            Utilities.loadImage(context, rocketImage, model.flickr_images[0])
        }
    }
}