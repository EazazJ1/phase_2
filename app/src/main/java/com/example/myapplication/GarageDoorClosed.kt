package com.example.myapplication

import com.example.myapplication.Command
import com.example.myapplication.Garage

class GarageDoorClosed: Command {

    var currentDoor: Garage? = null

    fun setGarage(inputGarage: Garage?) {
        currentDoor = inputGarage
    }
        override fun execute() {
            currentDoor?.off()
        }
        override fun undo() {
            currentDoor?.on()
        }
}