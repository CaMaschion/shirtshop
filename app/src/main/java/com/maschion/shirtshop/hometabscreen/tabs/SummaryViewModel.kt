package com.maschion.shirtshop.hometabscreen.tabs

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.maschion.shirtshop.hometabscreen.TabScreenViewModel
import com.maschion.shirtshop.utils.UIState
import javax.inject.Inject

class SummaryViewModel @Inject constructor(
    val mainViewModel: TabScreenViewModel
) : ViewModel() {

    private var initModel = SummaryModel(
        state = UIState.Content,
        titleLabel = "Resumo"
    )
    var uiState: SummaryModel by mutableStateOf(initModel)

    fun updateTabIndex(isSwipeToTheLeft : Boolean) {
        mainViewModel.updateTabIndexBasedOnSwipe(isSwipeToTheLeft = isSwipeToTheLeft)
    }

}