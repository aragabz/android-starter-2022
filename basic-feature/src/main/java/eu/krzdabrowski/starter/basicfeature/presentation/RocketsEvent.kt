package eu.krzdabrowski.starter.basicfeature.presentation

sealed class RocketsEvent {
    data class OpenWebBrowserWithDetails(val uri: String) : RocketsEvent()
    data class OpenRocketDetails(val rocketName: String) : RocketsEvent()
}
