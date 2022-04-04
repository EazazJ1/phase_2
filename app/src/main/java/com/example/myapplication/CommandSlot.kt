package com.example.myapplication

import com.example.myapplication.Command

class CommandSlot {

    var slotOnCommand: Command? = null
    var slotOffCommand: Command? = null
    var lastCommand: Command? = null
    var slotState: Boolean
    var slotUsed: Boolean

    internal constructor(inputOnCommand: Command?, inputOffCommand: Command?) {
        slotOnCommand = inputOnCommand
        slotOffCommand = inputOffCommand
        slotState = false
        slotUsed = true
    }

    internal constructor() {
        slotState = false
        slotUsed = false
    }

    fun OnButtonWasPressed() {
        slotOnCommand!!.execute()
        lastCommand = slotOnCommand
    }

    fun OffButtonWasPressed() {
        slotOffCommand!!.execute()
        lastCommand = slotOffCommand
    }

    fun undoButtonWasPressed() {
        lastCommand!!.undo()
        if(slotState == true)
        {
            slotState = false
        }
        else if(slotState == false){
            slotState = true
        }

    }

    fun setOnCommand(inputOnCommand: Command?) {
        slotOnCommand = inputOnCommand
    }

    fun setOffCommand(inputOffCommand: Command?) {
        slotOffCommand = inputOffCommand
    }
    fun getSlotState(): Boolean? {
        return slotState
    }

    fun setSlotState(inputState: Boolean?) {
        slotState = inputState!!
    }
    fun getSlotUsed(): Boolean? {
        return slotUsed
    }

    fun setSlotUsed(inputState: Boolean?) {
        slotUsed = inputState!!
    }
    fun getCommandOn(): Command? {
        return slotOnCommand
    }

    fun getCommandOff(): Command? {
        return slotOffCommand
    }


}