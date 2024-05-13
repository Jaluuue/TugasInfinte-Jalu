package com.example.bottomnavigation.component

import android.content.Context
import android.content.Intent
import com.example.bottomnavigation.R

fun shareItem(context: Context){
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, context.getString(androidx.compose.ui.R.string.navigation_menu))
        putExtra(Intent.EXTRA_TEXT, context.getString(androidx.compose.ui.R.string.navigation_menu))
    }

    context.startActivity(
        Intent.createChooser(
            intent,
            context.getString(androidx.compose.ui.R.string.navigation_menu)
        )
    )
}