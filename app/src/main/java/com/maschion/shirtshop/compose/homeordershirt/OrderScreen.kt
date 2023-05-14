package com.maschion.shirtshop.compose.homeordershirt

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.maschion.shirtshop.compose.shirtdetails.DetailsScreen
import com.maschion.shirtshop.compose.shirtmeasure.MeasureScreen
import com.maschion.shirtshop.compose.shirtsummary.SummaryScreen

@Composable
fun OrderScreen() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Medidas", "Detalhes", "Resumo")

    Column(modifier = Modifier.fillMaxWidth()) {
        ScrollableTabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> DetailsScreen()
            1 -> MeasureScreen()
            2 -> SummaryScreen()
        }
    }
}