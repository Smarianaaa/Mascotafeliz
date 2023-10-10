package com.example.mascotafeliz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mascotafeliz.ui.theme.MascotaFelizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFelizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.perro), contentDescription = "Macosta feliz")
        Text(
            "Mascota Feliz",
            color = Color.Blue,
            fontSize = 30.sp,
        )
        Text("Bienvenido, usuario")
        Row {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Tu Mascota")
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Contenido")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview() {
    MascotaFelizTheme {
        Elementos()
    }
}