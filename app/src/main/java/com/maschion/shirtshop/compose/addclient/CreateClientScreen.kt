package com.maschion.shirtshop.compose.addclient

import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CreateClient() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context = LocalContext.current

        var clientName by remember {
            mutableStateOf("")
        }
        var clientNameError by remember {
            mutableStateOf(false)
        }
        var clientPhone by remember {
            mutableStateOf("")
        }
        var clientPhoneError by remember {
            mutableStateOf(false)
        }
        var clientEmail by remember {
            mutableStateOf("")
        }
        var clientBirthday by remember {
            mutableStateOf("")
        }
        var clientFabric by remember {
            mutableStateOf("")
        }
        var hasError by remember {
            mutableStateOf(false)
        }


        OutlinedTextField(
            value = clientName,
            isError = clientNameError,
            onValueChange = {
                clientName = it
                clientNameError = clientName.isEmpty()
                hasError = clientNameError
            },
            label = { Text("Nome") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = clientPhone,
            onValueChange = {
                clientPhone = it
                clientPhoneError = clientPhone.isEmpty()
                hasError = clientPhoneError
                            },
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
            label = {
                Text("Tecidos")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            modifier = Modifier.height(150.dp),
        )

        Spacer(modifier = Modifier.height(100.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                enabled = !hasError,
                onClick = {
                    if (!hasError) {
                        Toast.makeText(context, "ok", Toast.LENGTH_LONG).show()
                    }
                },
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
