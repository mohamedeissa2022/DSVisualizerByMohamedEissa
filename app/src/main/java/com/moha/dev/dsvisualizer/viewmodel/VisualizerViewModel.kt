package com.moha.dev.dsvisualizer.viewmodel

import com.moha.dev.dsvisualizer.animation.AnimationStep

class VisualizerViewModel : ViewModel() {

    var nodes by mutableStateOf(listOf<VisualNode>())
    var links by mutableStateOf(listOf<VisualLink>())
    var message by mutableStateOf("")

    fun apply(step: AnimationStep) {
        when (step) {
            is AnimationStep.CreateNode -> {
                nodes = nodes + VisualNode(
                    id = step.id,
                    value = step.value,
                    x = 100f + nodes.size * 120f,
                    y = 150f
                )
            }

            is AnimationStep.CreateLink -> {
                links = links + VisualLink(step.from, step.to)
            }

            is AnimationStep.RemoveLink -> {
                links = links.filterNot {
                    it.from == step.from && it.to == step.to
                }
            }

            is AnimationStep.UpdateValue -> {
                nodes = nodes.map {
                    if (it.id == step.id)
                        it.copy(value = step.value)
                    else it
                }
            }

            is AnimationStep.Message -> {
                message = step.text
            }
            else -> {}
        }
    }
}
