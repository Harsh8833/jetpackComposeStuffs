package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    quads()
                }

            }
        }
    }
}

@Composable
fun quads() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            quad(
                modifier = Modifier.weight(0.5f),
                title = "Text composable",
                body = "Displays text and follows Material Design guidelines.",
                color = Color.Green

            )
            quad(
                modifier = Modifier.weight(0.5f),
                    title = "Text composable",
            body = "Displays text and follows Material Design guidelines.",
            color = Color.Yellow
            )
        }
        Row(Modifier.weight(1f)) {
            quad(
                modifier = Modifier.weight(1f),
                title = "Text composable",
                body = "Displays text and follows Material Design guidelines.",
                color = Color.Cyan
            )
            quad(
                modifier = Modifier.weight(1f),
                title = "Text composable",
                body = "Displays text and follows Material Design guidelines.",
                color = Color.LightGray
            )
        }
    }
}

@Composable
fun quad(modifier: Modifier, title: String, body: String, color: Color) {
    Column(
        modifier = modifier.fillMaxSize()
            .background(color = color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            title,
            modifier = Modifier.padding(bottom = 16.dp),
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(body, style = TextStyle(textAlign = TextAlign.Justify))
    }



}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {

    }
}