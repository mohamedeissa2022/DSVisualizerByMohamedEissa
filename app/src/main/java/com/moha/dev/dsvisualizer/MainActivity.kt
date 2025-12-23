package com.moha.dev.dsvisualizer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.moha.dev.dsvisualizer.ui.screens.ExplanationSection
import com.moha.dev.dsvisualizer.ui.screens.VisualizationArea
import com.moha.dev.dsvisualizer.ui.screens.VisualizerTopBar
import com.moha.dev.dsvisualizer.ui.theme.DSVisualizerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme(
                colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme()
            ) {
                VisualizerTopBar()
                //   VisualizationArea(content)
                //  ExplanationSection(text,code)
            }
        }
//            DSVisualizerTheme {
//
//
//
//            }
        }
    }






