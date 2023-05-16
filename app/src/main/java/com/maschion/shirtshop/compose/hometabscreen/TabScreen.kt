package com.maschion.shirtshop.compose.hometabscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import com.maschion.shirtshop.compose.hometabscreen.tabs.DetailsTabScreen
import com.maschion.shirtshop.compose.shirtmeasure.MeasureTabScreen
import com.maschion.shirtshop.compose.shirtsummary.SummaryTabScreen

@Composable
fun TabScreen(viewModel: TabScreenViewModel) {
    var tabIndex by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxWidth()) {
        ScrollableTabRow(selectedTabIndex = tabIndex) {
            viewModel.tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> MeasureTabScreen(viewModel = viewModel)
            1 -> DetailsTabScreen(viewModel = viewModel)
            2 -> SummaryTabScreen(viewModel = viewModel)
        }
    }
}
