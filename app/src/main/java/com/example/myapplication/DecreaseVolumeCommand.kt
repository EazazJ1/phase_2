package com.example.myapplication

import com.example.myapplication.*

class DecreaseVolumeCommand : Command {

    var currentRadio: Radio? = null

    fun setRadio(inputRadio: Radio?) {
        currentRadio = inputRadio
    }
    override fun execute() {
        currentRadio?.modifyRadioVolume(-5)
    }
    override fun undo() {
        currentRadio?.modifyRadioVolume(5)
    }
}