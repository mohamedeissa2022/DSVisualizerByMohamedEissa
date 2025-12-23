package com.moha.dev.dsvisualizer.utils

sealed class UserAction {
    data class Insert(val value: Int) : UserAction()
    data class Delete(val index: Int) : UserAction()
    data class Update(val index: Int, val value: Int) : UserAction()
    data class BreakLink(val from: Int, val to: Int) : UserAction()
    data class ConnectLink(val from: Int, val to: Int) : UserAction()
}