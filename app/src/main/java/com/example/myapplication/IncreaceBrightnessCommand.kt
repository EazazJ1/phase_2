package com.example.myapplication

import com.example.myapplication.*

class IncreaceBrightnessCommand : Command {

    var currentLight: Light? = null

    fun setLight(inputLight: Light?) {
        currentLight = inputLight
    }
    override fun execute() {
        currentLight?.modifyBrightness(5)
    }
    override fun undo() {
        currentLight?.modifyBrightness(-5)
    }
}