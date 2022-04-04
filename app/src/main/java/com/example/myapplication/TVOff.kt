package com.example.myapplication

import com.example.myapplication.*

class TVOffCommand : Command {
        var currentTV: TV? = null

        fun setTV(inputTV: TV?) {
            currentTV = inputTV
        }
        override fun execute() {
            currentTV?.off()
        }
        override fun undo() {
            currentTV?.on()
        }
    }
