package com.yenen.ahmet.smartbigburger.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yenen.ahmet.smartbigburger.databinding.ItemProductSummaryLayoutBinding
import com.yenen.ahmet.smartbigburger.model.ProductModel
import com.yenen.ahmet.smartbigburger.recyclerviewhelper.BaseRecyclerViewAdapter

class ProductSummaryAdapter
constructor(items: MutableList<ProductModel>)
    :BaseRecyclerViewAdapter<ProductModel,ProductSummaryAdapter.ViewHolder> (items){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductSummaryLayoutBinding.inflate(getInflater(parent), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) {
            holder.bind(item)
        }
    }


    inner class ViewHolder(val binding: ItemProductSummaryLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductModel) {
            binding.viewadapter = item
            binding.executePendingBindings()
        }
    }

}