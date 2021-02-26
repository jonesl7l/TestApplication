package com.jonesl7l.testapplication.adapter.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.viewmodels.GenericItem

class ButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: GenericItem, callback: AdapterItemInterface) {
        (itemView as? TextView)?.apply {
            text = item.title
            item.tag?.let { tag ->
                setOnClickListener { callback.onItemClick(tag) }
            }
        }
    }
}