package com.jonesl7l.testapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jonesl7l.testapplication.databinding.ItemNicBinding
import com.jonesl7l.testapplication.helpers.NetworkCallHelper
import com.jonesl7l.testapplication.viewmodels.Nic

class NicAdapter(private val listItems: MutableList<Nic>) : RecyclerView.Adapter<NicAdapter.NicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NicViewHolder {
        val binding = ItemNicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NicViewHolder, position: Int) {
        (holder as? NicViewHolder)?.bind(listItems[position])
    }

    override fun getItemCount(): Int = listItems.size

    fun updateDataSet(newNics: List<Nic>) {
        listItems.clear()
        listItems.addAll(newNics)
        notifyDataSetChanged()
    }

    inner class NicViewHolder(private val binding: ItemNicBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Nic) {
            with(binding) {
                nicName.text = item.name
                nicLevel.text = item.nicLevel.toString()
                NetworkCallHelper.fetchImageWithPicasso(nicImage, item.image)
            }
        }
    }
}