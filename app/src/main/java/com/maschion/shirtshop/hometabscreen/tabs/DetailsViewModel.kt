package com.maschion.shirtshop.hometabscreen.tabs

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.maschion.shirtshop.hometabscreen.TabScreenViewModel
import com.maschion.shirtshop.utils.UIState
import javax.inject.Inject

class DetailsViewModel @Inject constructor(
    val mainViewModel: TabScreenViewModel
) : ViewModel() {

    private var initModel = DetailsModel(
        state = UIState.Content,
        titleLabel = "Detalhes",
        //apenas um exemplo de como obter valores de outros viewModels
        titleExplanation = mainViewModel.measureViewModel.uiState.titleLabel
    )
    var uiState: DetailsModel by mutableStateOf(initModel)

    fun updateTabIndex(isSwipeToTheLeft : Boolean){
        mainViewModel.updateTabIndexBasedOnSwipe(isSwipeToTheLeft = isSwipeToTheLeft)
    }

}