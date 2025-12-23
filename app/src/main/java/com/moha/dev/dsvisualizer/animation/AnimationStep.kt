package com.moha.dev.dsvisualizer.animation

sealed class AnimationStep {
    data class CreateNode(val id: Int, val value: Int) : AnimationStep()
    data class RemoveNode(val id: Int) : AnimationStep()
    data class HighlightNode(val id: Int) : AnimationStep()
    data class CreateLink(val from: Int, val to: Int) : AnimationStep()
    data class RemoveLink(val from: Int, val to: Int) : AnimationStep()
    data class UpdateValue(val id: Int, val value: Int) : AnimationStep()
    data class Message(val text: String) : AnimationStep()
}
