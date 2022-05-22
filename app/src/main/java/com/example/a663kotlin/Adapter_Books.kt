package com.example.a561kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a662kotlin.Books
import com.example.a663kotlin.R

class Adapter_Books (var context: Context, var list: ArrayList<Books>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.books, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val hor = list[position]
        if (holder is MyViews){
            holder.image.setImageResource(hor.image)
            holder.title.text = hor.title
            holder.cost.text = hor.costs
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {
        var image: ImageView = item.findViewById(R.id.books_image_id)
        var title:TextView = item.findViewById(R.id.books_text_id)
        var cost:TextView = item.findViewById(R.id.books_cost_id)
    }
}