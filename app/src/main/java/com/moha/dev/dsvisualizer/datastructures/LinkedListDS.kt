package com.moha.dev.dsvisualizer.datastructures

import com.moha.dev.dsvisualizer.animation.AnimationStep

class LinkedListDS {
    private var idCounter = 0
    private val nodes = mutableListOf<Int>()

    fun insert(value: Int): List<AnimationStep> {
        val id = idCounter++

        return listOf(
            AnimationStep.Message("Create new node"),
            AnimationStep.CreateNode(id, value),
            AnimationStep.CreateLink(
                from = nodes.lastOrNull() ?: -1,
                to = id
            )
        ).also {
            nodes.add(id)
        }
    }

    fun breakLink(from: Int, to: Int): List<AnimationStep> {
        return listOf(
            AnimationStep.Message("Breaking link"),
            AnimationStep.RemoveLink(from, to)
        )
    }

    fun connectLink(from: Int, to: Int): List<AnimationStep> {
        return listOf(
            AnimationStep.Message("Connecting link"),
            AnimationStep.CreateLink(from, to)
        )
    }

}
