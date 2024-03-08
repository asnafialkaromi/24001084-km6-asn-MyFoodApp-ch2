package com.example.myfoodapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.databinding.ItemMenuBinding
import com.example.myfoodapp.model.Menu
import com.example.myfoodapp.utils.toIndonesianFormat

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder (private val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Menu){
            binding.ivMenuImage.setImageResource(item.image)
            binding.tvMenuName.text = item.name
            binding.tvMenuRating.text = item.rating.toString()
            binding.tvMenuPrice.text = item.price.toIndonesianFormat()
        }
    }

    private val data = mutableListOf<Menu>()

    fun insertData(items: List<Menu>) {
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(data[position])
    }

}