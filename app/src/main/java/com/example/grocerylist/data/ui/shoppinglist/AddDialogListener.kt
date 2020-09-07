package com.example.grocerylist.data.ui.shoppinglist

import com.example.grocerylist.data.db.entities.ShoppingItem

interface AddDialogListener {
    
    fun onAddButtonClicked(item: ShoppingItem)
}