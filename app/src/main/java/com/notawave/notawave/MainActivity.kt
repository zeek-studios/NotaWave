package com.notawave.notawave

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.notawave.notawave.ui.theme.NotaWaveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotaWaveTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NotaWaveApp()
                }
            }
        }
    }
}

@Composable
fun NotaWaveApp() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "NotaWave Prototype", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        // Mock Recording Screen
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Recording Interface")
                Button(onClick = { /* Mock */ }) { Text("Start Recording") }
                // Placeholder waveform
                Box(modifier = Modifier.height(100.dp).fillMaxWidth().background(MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        // Mock Dashboard with demo data
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Task Dashboard")
                // Demo tasks
                Text("Summary: Meeting notes...")
                Text("To-do: Follow up on project")
                Text("Note: Remember deadline")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotaWaveTheme {
        NotaWaveApp()
    }
}

