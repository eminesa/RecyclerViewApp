package com.example.recyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.dto.DataDTO

class NewListViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context)
        .inflate(R.layout.adapter_item_new_list, viewGroup, false)) {
    private val txtTitle by lazy { itemView.findViewById<TextView>(R.id.txtNewTitle) }
    private val txtSummary by lazy { itemView.findViewById<TextView>(R.id.txtNewSummary) }
    private val image by lazy { itemView.findViewById<ImageView>(R.id.imageNew) }

    fun bindTo(dataDTO: DataDTO) {

        txtTitle.text = dataDTO.title
        txtSummary.text = dataDTO.summary
        image.setImageResource(dataDTO.image)
    }
}
