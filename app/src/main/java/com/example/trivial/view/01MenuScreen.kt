package com.example.trivial.view

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivial.NavigationButton
import com.example.trivial.R
import com.example.trivial.viewModel.GameViewModel

@Composable
fun MenuScreen(navController: NavController, vm: GameViewModel) {
    val configuration = LocalConfiguration.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        if (configuration.orientation != Configuration.ORIENTATION_LANDSCAPE) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            )
            NavigationButton("Nueva partida", "GameScreen", navController, vm, configuration)
            Spacer(modifier = Modifier.height(15.dp))
            NavigationButton("Configuración", "SettingsScreen", navController, vm, configuration)
        } else {
            Row(
                modifier = Modifier.fillMaxWidth(0.95f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                NavigationButton("Nueva partida", "GameScreen", navController, vm, configuration)
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .fillMaxWidth(0.30f)
                )
                NavigationButton("Configuración", "SettingsScreen", navController, vm, configuration)
            }
        }
    }
}

