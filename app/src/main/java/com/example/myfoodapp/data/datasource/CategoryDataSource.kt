package com.example.myfoodapp.data.datasource

import com.example.myfoodapp.R
import com.example.myfoodapp.data.model.Category

interface CategoryDataSource {
    fun getCategoryData(): List<Category>
}

class CategoryDataSourceImpl() : CategoryDataSource {
    override fun getCategoryData(): List<Category> {
        return mutableListOf(
            Category(image = R.drawable.ic_rice, name = "Nasi"),
            Category(image = R.drawable.ic_noodle, name = "Mie"),
            Category(image = R.drawable.ic_drink, name = "Minuman"),
            Category(image = R.drawable.ic_bread, name = "Roti"),
            Category(image = R.drawable.ic_snack, name = "Snack")
        )
    }
}