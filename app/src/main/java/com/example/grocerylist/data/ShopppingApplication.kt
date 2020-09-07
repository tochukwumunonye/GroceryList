package com.example.grocerylist.data

import android.app.Application
import com.example.grocerylist.data.db.ShoppingDatabase
import com.example.grocerylist.data.repositories.ShoppingRepository
import com.example.grocerylist.data.ui.shoppinglist.ShoppingViewModel
import com.example.grocerylist.data.ui.shoppinglist.ShoppingViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class ShopppingApplication: Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        import(androidXModule(this@ShopppingApplication))
        bind() from singleton {ShoppingDatabase(instance())}
        bind() from singleton { ShoppingRepository(instance())}
        bind() from provider {
            ShoppingViewModelFactory(instance())
        }
    }
}