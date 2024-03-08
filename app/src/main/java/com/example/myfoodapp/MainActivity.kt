package com.example.myfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfoodapp.databinding.ActivityMainBinding
import com.example.myfoodapp.model.Category
import com.example.myfoodapp.model.Menu

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var adapterCategory = CategoryAdapter()
    private var adapterMenu = MenuAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListMenu()
    }

    private fun setListCategory() {
        val dataCategory = listOf(
            Category(image = R.drawable.ic_rice, name = "Nasi"),
            Category(image = R.drawable.ic_noodle, name = "Mie"),
            Category(image = R.drawable.ic_drink, name = "Minuman"),
            Category(image = R.drawable.ic_bread, name = "Roti"),
            Category(image = R.drawable.ic_snack, name = "Snack")
        )

        binding.rvCategory.apply {
            adapter = this@MainActivity.adapterCategory
        }
        adapterCategory.insertData(dataCategory)
    }

    private fun setListMenu() {
        val dataMenu = listOf(
            Menu(
                image = R.drawable.img_fried_rice,
                name = "Nasi goreng",
                rating = 4.9,
                price = 15000.0
            ),
            Menu(
                image = R.drawable.img_fried_noodle,
                name = "Mie goreng",
                rating = 4.3,
                price = 10000.0
            ),
            Menu(
                image = R.drawable.img_choco_drink,
                name = "Es Coklat",
                rating = 4.7,
                price = 5000.0
            ),
            Menu(image = R.drawable.img_burger, name = "Burger", rating = 4.9, price = 20000.0),
            Menu(
                image = R.drawable.img_boiled_noodle,
                name = "Mie Rebus",
                rating = 4.4,
                price = 12000.0
            ),
            Menu(
                image = R.drawable.img_fried_chiken,
                name = "Ayam Geprek",
                rating = 4.9,
                price = 8000.0
            ),
            Menu(
                image = R.drawable.img_sushi,
                name = "Shusi",
                rating = 4.7,
                price = 40000.0
            ),
            Menu(
                image = R.drawable.img_snack_pack,
                name = "Doritos",
                rating = 4.5,
                price = 4000.0)
        )

        binding.rvMenu.apply {
            adapter = this@MainActivity.adapterMenu
        }
        adapterMenu.insertData(dataMenu)
    }
}