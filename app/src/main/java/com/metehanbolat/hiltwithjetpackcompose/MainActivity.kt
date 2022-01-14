package com.metehanbolat.hiltwithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.hiltwithjetpackcompose.ui.theme.HiltwithJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltwithJetpackComposeTheme {

            }
        }
    }
}
