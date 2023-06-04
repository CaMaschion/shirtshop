package com.maschion.shirtshop.hometabscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.maschion.shirtshop.hometabscreen.tabs.detailsScreen.DetailsTabScreen
import com.maschion.shirtshop.hometabscreen.tabs.measureScreen.MeasureTabScreen
import com.maschion.shirtshop.hometabscreen.tabs.summaryScreen.SummaryTabScreen
import com.maschion.shirtshop.login.LoginScreen

@Composable
fun TabScreen(
    viewModel: TabScreenViewModel) {
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
            0 -> MeasureTabScreen(viewModel = viewModel.measureViewModel)
            1 -> DetailsTabScreen(viewModel = viewModel.detailsViewModel)
            2 -> SummaryTabScreen(viewModel = viewModel.summaryViewModel)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TabScreenPreview(){
    TabScreen( viewModel())
}
