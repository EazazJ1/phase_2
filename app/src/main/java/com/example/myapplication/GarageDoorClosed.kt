package com.example.myapplication

import com.example.myapplication.Command
import com.example.myapplication.Garage

class GarageDoorClosed: Command {

    var currentDoor: Garage? = null

    fun setGarage(inputGarage: Garage?) {
        currentDoor = inputGarage
    }
        override fun execute() {
            currentDoor?.on()
        }
        override fun undo() {
            currentDoor?.off()
        }
}