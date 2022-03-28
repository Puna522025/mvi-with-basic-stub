package com.androidmvi.spacex.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.com.androidmvi.spacex.ui.databinding.RocketLaunchDetailsHeaderBinding
import com.com.androidmvi.spacex.ui.databinding.RocketLaunchDetailsItemBinding


class RocketLaunchDetailsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listOfLaunches = ArrayList<GetRocketDetailsDomainModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ViewType.HEADER -> {
                val binding = RocketLaunchDetailsHeaderBinding.inflate(inflater, parent, false)
                RocketLaunchDetailsHeaderViewHolder(binding)
            }
            ViewType.ITEM -> {
                val binding = RocketLaunchDetailsItemBinding.inflate(inflater, parent, false)
                return RocketLaunchItemViewHolder(binding)
            }
            else -> throw IllegalStateException()
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RocketLaunchItemViewHolder -> {
                holder.bind(listOfLaunches[position])
            }
            is RocketLaunchDetailsHeaderViewHolder -> {
                holder.bind(listOfLaunches[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listOfLaunches.size
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            listOfLaunches[position].isSection -> {
                ViewType.HEADER
            }
            else -> {
                ViewType.ITEM
            }
        }
    }

    fun setData(rockets: List<GetRocketDetailsDomainModel>?) {
        rockets?.let {
            listOfLaunches.clear()
            listOfLaunches.addAll(rockets)
            notifyDataSetChanged()
        }
    }

    @Retention(AnnotationRetention.SOURCE)
    private annotation class ViewType {
        companion object {
            var HEADER = 0
            var ITEM = 1
        }
    }
}