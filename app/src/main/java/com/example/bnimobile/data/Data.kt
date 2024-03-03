package com.example.bnimobile.data

import com.example.bnimobile.R
import com.example.bnimobile.model.Menu

object Data {

    val menu = listOf<Menu>(
        Menu(
            title = "Transfer",
            background = R.drawable.background_1,
            icon = R.drawable.transfer
        ),
        Menu(
            title = "E-Wallet",
            background = R.drawable.background_2,
            icon = R.drawable.ewallet
        ),
        Menu(
            title = "Pembayaran",
            background = R.drawable.background_3,
            icon = R.drawable.payment
        ),
        Menu(
            title = "Pembelian",
            background = R.drawable.background_4,
            icon = R.drawable.cart
        ),
        Menu(
            title = "Investasi",
            background = R.drawable.background_5,
            icon = R.drawable.invest
        ),
        Menu(
            title = "Life Goals",
            background = R.drawable.background_6,
            icon = R.drawable.goal
        ),
        Menu(
            title = "Digital Loan",
            background = R.drawable.background_7,
            icon = R.drawable.loan
        ),
        Menu(
            title = "My Credit Card",
            background = R.drawable.background_8,
            icon = R.drawable.credit
        ),
        Menu(
            title = "Rekeningku",
            background = R.drawable.background_9,
            icon = R.drawable.account
        ),
        Menu(
            title = "Mobile Tunai",
            background = R.drawable.background_9,
            icon = R.drawable.ewallet
        ),
        Menu(
            title = "DiKado",
            background = R.drawable.background_11,
            icon = R.drawable.gift
        ),
        Menu(
            title = "Menu Lain",
            background = null,
            icon = R.drawable.resource_else
        ),
    )
}