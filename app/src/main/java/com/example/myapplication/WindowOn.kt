package com.example.myapplication

import com.example.myapplication.*

class WindowOnCommand : Command {
        var currentWindow: Window? = null

        fun setWindow(inputWindow: Window?) {
            currentWindow = inputWindow
        }
        override fun execute() {
            currentWindow?.on()
        }
        override fun undo() {
            currentWindow?.off()
        }
    }