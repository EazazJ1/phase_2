package com.example.myapplication

import com.example.myapplication.Command
import com.example.myapplication.Light


class LightOnCommand : Command {

        var currentLight: Light? = null

        fun setLight(inputLight: Light?) {
            currentLight = inputLight
        }
        override fun execute() {
            currentLight?.on()
        }
        override fun undo() {
            currentLight?.off()
        }
    }
