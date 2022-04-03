package com.example.myapplication.com.example.myapplication

import com.example.myapplication.*

class DoorUnLockCommand : Command {

    var currentDoor: Door? = null

    fun setDoor(inputDoor: Door?) {
        currentDoor = inputDoor
    }

        override fun execute() {
            currentDoor?.unlock()
        }

        override fun undo() {
            currentDoor?.lock()
        }
}
