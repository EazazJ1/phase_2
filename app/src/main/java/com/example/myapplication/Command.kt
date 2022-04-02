package com.example.myapplication


interface Command {
        fun execute()
        fun undo()
}