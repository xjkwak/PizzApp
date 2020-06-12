package com.xjkwak.pizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicked(view: View) {

        var pizzaSizePrice = 0.0
        var toppingTotal = 0.0

        // Calculating pizza price based on its size
        when {
            smallpizza.isChecked -> pizzaSizePrice = 20.0
            mediumpizza.isChecked -> pizzaSizePrice = 50.0
            largepizza.isChecked -> pizzaSizePrice = 80.0
        }

        // Adding extra topping
        if (cebolla.isChecked) {
            toppingTotal += 2
        }

        if (aceituna.isChecked) {
            toppingTotal += 5
        }

        if (tomate.isChecked) {
            toppingTotal += 10
        }

        val totalPrice = pizzaSizePrice + toppingTotal

        totalprice.text = "Precio total de la orden: $totalPrice Bs."
    }
}