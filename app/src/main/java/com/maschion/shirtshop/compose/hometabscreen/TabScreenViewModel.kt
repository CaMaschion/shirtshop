package com.maschion.shirtshop.compose.hometabscreen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TabScreenViewModel (application: Application) : AndroidViewModel(application) {

    private val _tabIndex: MutableLiveData<Int> = MutableLiveData(0)
    val tabs = listOf("Medidas", "Detalhes", "Resumo")

    fun updateTabIndexBasedOnSwipe(isSwipeToTheLeft: Boolean) {
        _tabIndex.value = when (isSwipeToTheLeft) {
            true -> Math.floorMod(_tabIndex.value!!.plus(1), tabs.size)
            false -> Math.floorMod(_tabIndex.value!!.minus(1), tabs.size)
        }
    }

}