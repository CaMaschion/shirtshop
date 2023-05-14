package com.maschion.shirtshop

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maschion.shirtshop.compose.addclient.CreateClient
import com.maschion.shirtshop.compose.homeordershirt.HomeOrderScreen
import com.maschion.shirtshop.compose.login.Login
import com.maschion.shirtshop.ui.theme.ShirtshopTheme
import com.maschion.shirtshop.viewmodels.HomeOrderViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShirtshopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeOrderScreen(viewModel = HomeOrderViewModel(application = Application()))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShirtshopTheme {
        CreateClient()
    }
}