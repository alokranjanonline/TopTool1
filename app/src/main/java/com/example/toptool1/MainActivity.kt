package com.example.toptool1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.toptool1.ui.theme.TopTool1Theme
import java.util.Timer
import kotlin.concurrent.timerTask

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*var timer:Timer
        timer.schedule(2000) {
            val intent = Intent(this, CSActivity::class.java)
            startActivity(intent)
        }*/
        Timer().schedule(timerTask {
            val intent = Intent(this@MainActivity, CSActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TopTool1Theme {
        Greeting("Android")
    }
}