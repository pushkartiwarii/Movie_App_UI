package com.api.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.api.myapplication.ui.theme.AppNavigation
import com.api.myapplication.ui.theme.MovieAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieAppUITheme {
                AppNavigation()



                }
            }
        }
    }







