package com.maschion.shirtshop.compose.client

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun CreateClient() {
    var teste by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("example", TextRange(0, 7)))
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = teste,
            onValueChange = { teste = it },
            label = { Text("Label") }
        )
        Text(text = "${teste.text}")

    }
}
