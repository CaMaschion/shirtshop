package com.maschion.shirtshop.hometabscreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maschion.shirtshop.hometabscreen.tabs.detailsScreen.DetailsViewModel
import com.maschion.shirtshop.hometabscreen.tabs.measureScreen.MeasureViewModel
import com.maschion.shirtshop.hometabscreen.tabs.summaryScreen.SummaryViewModel

class TabScreenViewModel : ViewModel() {

    val detailsViewModel: DetailsViewModel by lazy { DetailsViewModel(mainViewModel = this) }
    val measureViewModel: MeasureViewModel by lazy { MeasureViewModel(mainViewModel = this) }
    val summaryViewModel: SummaryViewModel by lazy { SummaryViewModel(mainViewModel = this) }

    private val _tabIndex: MutableLiveData<Int> = MutableLiveData(0)
    val tabs = listOf("Medidas", "Detalhes", "Resumo")

    fun updateTabIndexBasedOnSwipe(isSwipeToTheLeft: Boolean) {
        _tabIndex.value = when (isSwipeToTheLeft) {
            true -> Math.floorMod(_tabIndex.value!!.plus(1), tabs.size)
            false -> Math.floorMod(_tabIndex.value!!.minus(1), tabs.size)
        }
    }

}