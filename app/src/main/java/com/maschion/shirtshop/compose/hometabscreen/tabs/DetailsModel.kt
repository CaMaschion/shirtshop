package com.maschion.shirtshop.compose.hometabscreen.tabs

import com.maschion.shirtshop.utils.UIState

data class DetailsModel(
    val state: UIState,
    val titleLabel: String,
    val titleExplanation: String
)