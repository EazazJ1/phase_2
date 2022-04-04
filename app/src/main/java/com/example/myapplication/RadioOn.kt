package com.example.myapplication

import com.example.myapplication.*

class RadioOnCommand : Command {
        var currentRadio: Radio? = null

        fun setRadio(inputRadio: Radio?) {
            currentRadio = inputRadio
        }
        override fun execute() {
            currentRadio?.on()
        }
        override fun undo() {
            currentRadio?.off()
        }
    }
