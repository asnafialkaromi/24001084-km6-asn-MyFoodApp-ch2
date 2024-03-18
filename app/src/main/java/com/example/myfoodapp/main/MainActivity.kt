package com.example.myfoodapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myfoodapp.R
import com.example.myfoodapp.data.datasource.CategoryDataSource
import com.example.myfoodapp.data.datasource.CategoryDataSourceImpl
import com.example.myfoodapp.data.datasource.MenuDataSource
import com.example.myfoodapp.data.datasource.MenuDataSourceImpl
import com.example.myfoodapp.data.model.Menu
import com.example.myfoodapp.databinding.ActivityMainBinding
import com.example.myfoodapp.detail.DetailActivity
import com.example.myfoodapp.presentation.categorylist.CategoryAdapter
import com.example.myfoodapp.presentation.menulist.MenuAdapter
import com.example.myfoodapp.presentation.menulist.OnItemClickedListener

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val dataSource: CategoryDataSource by lazy {
        CategoryDataSourceImpl()
    }
    private val dataSourceMenu: MenuDataSource by lazy {
        MenuDataSourceImpl()
    }
    private var adapterCategory = CategoryAdapter()
    private var adapterMenu: MenuAdapter? = null
    private var isUsingGridMode: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        bindMenuList(isUsingGridMode)
        setClickActionMenu()
    }

    private fun setClickActionMenu() {
        binding.layoutListMenu.btnChangeMode.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            setButtonImage(isUsingGridMode)
            bindMenuList(isUsingGridMode)
        }
    }

    private fun setButtonImage(isUsingGrid: Boolean) {
        binding.layoutListMenu.btnChangeMode.setImageResource(if (isUsingGrid) R.drawable.ic_list else R.drawable.ic_grid)
    }

    private fun bindMenuList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) MenuAdapter.MODE_GRID else MenuAdapter.MODE_LIST
        adapterMenu = MenuAdapter(
            listMode = listMode,
            listener = object : OnItemClickedListener<Menu> {
                override fun onItemClicked(item: Menu) {
                    navigateToDetail(item)
                }

            }
        )
        binding.layoutListMenu.rvMenuGrid.apply {
            adapter = this@MainActivity.adapterMenu
            layoutManager = GridLayoutManager(this@MainActivity, if (isUsingGridMode) 2 else 1)
        }
        adapterMenu?.insertData(dataSourceMenu.getMenuData())
    }

    private fun navigateToDetail(item : Menu) {
        DetailActivity.startActivity(this,item)
    }

    private fun setListCategory() {
        binding.rvCategory.apply {
            adapter = this@MainActivity.adapterCategory
        }
        adapterCategory.insertData(dataSource.getCategoryData())
    }
}