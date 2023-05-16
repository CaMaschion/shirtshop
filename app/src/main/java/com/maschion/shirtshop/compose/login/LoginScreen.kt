package com.maschion.shirtshop.compose.login

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
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Login() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val context = LocalContext.current

        var email by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        var hasError by remember {
            mutableStateOf(false)
        }
        var hasEmailError by remember {
            mutableStateOf(false)
        }
        var hasPasswordError by remember {
            mutableStateOf(false)
        }

        OutlinedTextField(
            value = email,
            isError = hasEmailError,
            onValueChange = {
                email = it
                hasEmailError = email.isEmpty()
                hasError = hasEmailError
            },
            label = { Text("E-mail") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
                hasPasswordError = password.isEmpty()
                hasError = hasPasswordError
            },
            label = { Text("Senha") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

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
                Text(text = "Entrar")
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

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
                Text(text = "Registrar")
            }
        }
    }

}