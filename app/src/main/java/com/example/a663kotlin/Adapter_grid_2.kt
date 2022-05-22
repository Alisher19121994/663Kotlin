package com.example.a561kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.a663kotlin.R

class Adapter_grid_2 (var context: Context, var list: ArrayList<grid_2>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.products_gridview_2, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val hor = list[position]
        if (holder is MyViews){
            holder.image.setImageResource(hor.image)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        var image: ImageView = item.findViewById(R.id.grid_popular_image_id)
    }
}