package com.example.myapplication.com.example.myapplication

import com.example.myapplication.*

class WindowOffCommand : Command {
        var currentWindow: Window? = null

        fun setWindow(inputWindow: Window?) {
            currentWindow = inputWindow
        }
        override fun execute() {
            currentWindow?.off()
        }
        override fun undo() {
            currentWindow?.on()
        }
    }