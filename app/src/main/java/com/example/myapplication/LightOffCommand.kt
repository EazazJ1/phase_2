package com.example.myapplication.com.example.myapplication

import com.example.myapplication.Command
import com.example.myapplication.Light


class LightOffCommand : Command {
        var currentLight: Light? = null

        fun setLight(inputLight: Light?) {
            currentLight = inputLight
        }
        override fun execute() {
            currentLight?.off()
        }
        override fun undo() {
            currentLight?.on()
        }
    }
