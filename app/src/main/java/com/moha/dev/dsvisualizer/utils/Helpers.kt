package com.moha.dev.dsvisualizer.utils

data class VisualNode(
    val id: Int,
    val value: Int,
    val x: Float,
    val y: Float,
    val highlighted: Boolean = false
)

data class VisualLink(
    val from: Int,
    val to: Int
)
