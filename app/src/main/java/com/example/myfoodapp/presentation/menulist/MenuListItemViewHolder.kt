package com.example.myfoodapp.presentation.menulist

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myfoodapp.base.ViewHolderBinder
import com.example.myfoodapp.data.model.Menu
import com.example.myfoodapp.databinding.ItemMenuListBinding
import com.example.myfoodapp.utils.toIndonesianFormat

class MenuListItemViewHolder(
    private val binding: ItemMenuListBinding,
    private val listener: OnItemClickedListener<Menu>
) : ViewHolder(binding.root), ViewHolderBinder<Menu> {
    override fun bind(item: Menu) {
        item.let {
            binding.ivMenuImage.setImageResource(it.image)
            binding.tvMenuName.text = it.name
            binding.tvMenuPrice.text = it.price.toIndonesianFormat()
            binding.tvMenuRating.text = it.rating.toString()
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }

    }
}