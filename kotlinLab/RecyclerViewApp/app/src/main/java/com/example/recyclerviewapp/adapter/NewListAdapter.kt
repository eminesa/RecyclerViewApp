package com.example.recyclerviewapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.dto.DataDTO

class NewListAdapter(private val newsList: List<DataDTO>) : RecyclerView.Adapter<NewListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewListViewHolder {
        return NewListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewListViewHolder, position: Int) {
        holder.bindTo(newsList[position])
    }
}