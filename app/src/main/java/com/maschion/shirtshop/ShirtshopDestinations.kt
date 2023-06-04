package com.maschion.shirtshop

sealed class ShirtshopDestinations (val route: String) {
    object Login: ShirtshopDestinations(route = "login_screen")
    object Tab: ShirtshopDestinations(route = "Tab_screen")
}

