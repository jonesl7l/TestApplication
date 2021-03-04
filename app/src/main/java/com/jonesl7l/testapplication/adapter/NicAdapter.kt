package com.jonesl7l.testapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.appContext
import com.jonesl7l.testapplication.databinding.ItemNicBinding
import com.jonesl7l.testapplication.helpers.NetworkCallHelper
import com.jonesl7l.testapplication.viewmodels.Nic

class NicAdapter(private val  listItems: MutableList<Nic>) : RecyclerView.Adapter<NicAdapter.NicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NicViewHolder {
        val binding = ItemNicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NicViewHolder, position: Int) {
        (holder as? NicViewHolder)?.bind(listItems[position])
    }

    override fun getItemCount(): Int = listItems.size

    fun updateDataSet(newNics: List<Nic>) {
        val diffResult = DiffUtil.calculateDiff(object : DiffUtil.Callback() {

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return newNics[newItemPosition].name == listItems[oldItemPosition].name
                        && newNics[newItemPosition].nicLevel == listItems[oldItemPosition].nicLevel
                        && newNics[newItemPosition].image == listItems[oldItemPosition].image
            }

            override fun getOldListSize(): Int = listItems.size

            override fun getNewListSize(): Int = newNics.size

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean = newNics[newItemPosition] == listItems[oldItemPosition]
        })

        diffResult.dispatchUpdatesTo(this)
        listItems.clear()
        listItems.addAll(newNics)
    }

    inner class NicViewHolder(private val binding: ItemNicBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Nic) {
            with(binding) {
                nicName.text = appContext().getString(R.string.nic_name_replacement).replace("{NAME}", item.name)
                nicLevel.text = appContext().getString(R.string.nic_power_replacement).replace("{POWER}", item.nicLevel.toString())
                NetworkCallHelper.fetchImageWithPicasso(nicImage, item.image)
            }
        }
    }
}