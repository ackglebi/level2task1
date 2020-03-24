package com.example.placesofinterest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(place : Place) {
            itemView.placeImage.setImageResource(place.imageResId)
            itemView.placeName.text = place.name
        }
    }

    /**
     * Creates and returns a ViewHolder Object
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    /**
     * Returns size of the list
     */
    override fun getItemCount(): Int {
        return places.size
    }

    /**
     * Called by RecycleView to display the data at the specified position
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }
}