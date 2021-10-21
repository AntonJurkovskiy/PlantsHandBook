package com.azimut4946777.plantshandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azimut4946777.plantshandbook.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PalntHolder>() {

    class PalntHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = PlantItemBinding.bind(item)

        fun bind(plant: Plant) = with(binding) {
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PalntHolder {
        val view: = LayoutInflater.from(parent.context)
    }

    override fun onBindViewHolder(holder: PalntHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}