package com.maschion.shirtshop.compose.client

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun CreateClient() {

    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var clientName by remember {
            mutableStateOf(TextFieldValue())
        }
        var clientPhone by remember {
            mutableStateOf(TextFieldValue())
        }
        var clientEmail by remember {
            mutableStateOf(TextFieldValue())
        }
        var clientBirthday by remember {
            mutableStateOf(TextFieldValue())
        }
        var clientFabric by remember {
            mutableStateOf(TextFieldValue())
        }

        OutlinedTextField(
            value = clientName,
            onValueChange = { clientName = it },
            label = { Text("Nome") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = clientPhone,
            onValueChange = { clientPhone = it },
            label = { Text("Telefone") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = clientEmail,
            onValueChange = { clientEmail = it },
            label = { Text("E-mail") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = clientBirthday,
            onValueChange = { clientBirthday = it },
            label = { Text("Data de Aniversário") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = clientFabric,
            onValueChange = { clientFabric = it },
            label = { Text("Tecidos:") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(200.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Escolher camisa")
            }
        }
    }
}
