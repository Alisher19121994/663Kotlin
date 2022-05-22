package com.example.a561kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a662kotlin.Books
import com.example.a663kotlin.Explores
import com.example.a663kotlin.R

class Adapter_Explores (var context: Context, var list: ArrayList<Explores>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.explores, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val hor = list[position]
        if (holder is MyViews){
            holder.image.setImageResource(hor.image)
            holder.title.text = hor.title
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        var image: ImageView = item.findViewById(R.id.explore_image_id)
        var title:TextView = item.findViewById(R.id.explore_text_id)
    }
}