package com.example.myapplication

import com.example.myapplication.*

class TVOnCommand : Command {
        var currentTV: TV? = null

        fun setTV(inputTV: TV?) {
            currentTV = inputTV
        }
        override fun execute() {
            currentTV?.on()
        }
        override fun undo() {
            currentTV?.off()
        }
    }
