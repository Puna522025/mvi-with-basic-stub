package com.androidmvi.spacex.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import com.com.androidmvi.spacex.ui.databinding.RocketsListItemBinding

class RocketsListAdapter(private val onRocketClickListener: OnRocketClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listOfRockets = ArrayList<GetRocketsDomainModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RocketsListItemBinding.inflate(inflater, parent, false)
        return RocketItemViewHolder(binding, onRocketClickListener)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RocketItemViewHolder -> {
                holder.bind(listOfRockets[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listOfRockets.size
    }

    fun setData(rockets: List<GetRocketsDomainModel>?) {
        rockets?.let {
            listOfRockets.clear()
            listOfRockets.addAll(rockets)
            notifyDataSetChanged()
        }
    }
}