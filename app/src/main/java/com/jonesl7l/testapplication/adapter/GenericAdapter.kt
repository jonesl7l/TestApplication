package com.jonesl7l.testapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.adapter.viewholders.ButtonViewHolder
import com.jonesl7l.testapplication.viewmodels.GenericItem
import java.lang.IllegalStateException

class GenericAdapter(private val listItems: List<GenericItem>, private val callback: AdapterItemInterface) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    enum class GenericItemType(private val type: Int) {
        BUTTON(1);

        fun getValue() = this.type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            GenericItemType.BUTTON.getValue() -> ButtonViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_button, parent, false))
            else -> {
                throw IllegalStateException("Illegal view type")
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ButtonViewHolder -> holder.bind(listItems[position], callback)
            else -> {
                throw IllegalStateException("Illegal view holder type")
            }
        }
    }

    override fun getItemCount(): Int = listItems.size

    override fun getItemViewType(position: Int): Int = listItems[position].type.getValue()
}