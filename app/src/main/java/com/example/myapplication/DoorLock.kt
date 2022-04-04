package com.example.myapplication
import com.example.myapplication.*

class DoorLockCommand : Command {

    var currentDoor: Door? = null

    fun setDoor(inputDoor: Door?) {
        currentDoor = inputDoor
    }

        override fun execute() {
            currentDoor?.lock()
        }

        override fun undo() {
            currentDoor?.unlock()
        }
}
