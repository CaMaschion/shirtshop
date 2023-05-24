package com.maschion.shirtshop.utils

sealed class UIState {
    object Loading : UIState()
    object Content : UIState()
}