package eu.krzdabrowski.starter.basicfeature.presentation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RocketDetailsRoute(
    rocketName: String
) {
    RocketDetailsScreen(rocketName = rocketName)
}

@Composable
fun RocketDetailsScreen(
    modifier: Modifier = Modifier,
    rocketName: String
) {
    Scaffold { paddingValues ->
        Box(modifier = modifier.padding(paddingValues)) {
            Text(text =  rocketName)
        }
    }
}