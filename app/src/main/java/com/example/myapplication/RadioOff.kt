package com.example.myapplication

import com.example.myapplication.*

class RadioOffCommand : Command {
        var currentRadio: Radio? = null

        fun setTV(inputRadio: Radio?) {
            currentRadio = inputRadio
        }
        override fun execute() {
            currentRadio?.off()
        }
        override fun undo() {
            currentRadio?.on()
        }
    }
