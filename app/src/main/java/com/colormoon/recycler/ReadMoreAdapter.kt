package com.colormoon.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.colormoon.readmoretextview.R

/**
 * Created by Pushpendra Kumar on 28/11/24.
 * Copyright (c) 2024 Colour Moon Technologies Pvt. Ltd.
 */
class ReadMoreAdapter(private val context: Context, private val items: List<String>) :
    RecyclerView.Adapter<ReadMoreAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_text, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}

