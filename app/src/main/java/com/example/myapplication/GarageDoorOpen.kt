package com.example.myapplication.com.example.myapplication

import com.example.myapplication.Command

class GarageDoorOpen : Command {

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
