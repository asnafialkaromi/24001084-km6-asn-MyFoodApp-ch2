package com.example.myfoodapp.base

import com.example.myfoodapp.data.model.Menu

interface ViewHolderBinder <params>{
    fun bind(item : Menu)
}