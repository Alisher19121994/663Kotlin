package com.example.a561kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a663kotlin.R

class Adapter_H(var context: Context, var list: ArrayList<H_views>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.products_view_horizontal, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val hor = list[position]
        if (holder is MyViews){
            holder.title.text = hor.title
            holder.image.setImageResource(hor.imageView)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        var title: TextView = item.findViewById(R.id.hor_text_id)
        var image: ImageView = item.findViewById(R.id.hor_image_id)
    }
}