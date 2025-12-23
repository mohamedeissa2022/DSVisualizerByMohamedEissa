package com.moha.dev.dsvisualizer.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.moha.dev.dsvisualizer.utils.VisualNode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VisualizerTopBar() {
    TopAppBar(
        title = { Text("Array Visualization") }
    )
}
@Composable
fun VisualizationArea(content: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}
@Composable
fun ExplanationSection(text: String, code: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(Modifier.height(8.dp))

        Card {
            Text(
                text = code,
                modifier = Modifier.padding(12.dp),
                fontFamily = FontFamily.Monospace
            )
        }
    }
}


@Composable
fun NodeView(
    node: VisualNode,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .offset { IntOffset(node.x.toInt(), node.y.toInt()) }
            .size(56.dp)
            .background(
                if (node.highlighted) Color.Green else Color.Blue,
                CircleShape
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(node.value.toString(), color = Color.White)
    }
}
