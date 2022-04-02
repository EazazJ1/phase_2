package com.example.myapplication.com.example.myapplication

class RemoteControl {


    var remoteSlots: ArrayList<CommandSlot>
    var lastSlot: CommandSlot? = null

    //Turn the device/slot on if it is off, turn it off if it is on
    //if toggleSlot == true -> light on
    //if toggleSlot == false -> light off
    fun toggleSlot(slotNum: Int) {
        if (remoteSlots[slotNum].getSlotUsed() == false) {
            println("Slot Unused.")
        } else {
            if (remoteSlots.size > slotNum) {
                if (remoteSlots[slotNum].getSlotState() == true) {
                    remoteSlots[slotNum].OffButtonWasPressed()
                    remoteSlots[slotNum].setSlotState(false)
                } else {
                    remoteSlots[slotNum].OnButtonWasPressed()
                    remoteSlots[slotNum].setSlotState(true)
                }
                lastSlot = remoteSlots[slotNum]
            }
        }
    }

    fun getState(slotNum: Int): Boolean? {
        return remoteSlots[slotNum].getSlotState()
    }

    fun setState(slotNum: Int) {
        if (remoteSlots[slotNum].getSlotState() == true) {
            remoteSlots[slotNum].setSlotState(false)
        } else remoteSlots[slotNum].setSlotState(true)
    }

    fun undoButtonWasPressed() {
        lastSlot?.undoButtonWasPressed()
    }

    fun setSlot(inputSlot: CommandSlot) {
        remoteSlots.add(inputSlot)
    }

    fun getSlot(slotNum: Int): CommandSlot {
        return remoteSlots[slotNum]
    }

    fun removeSlot(slotNum: Int) {
        remoteSlots.removeAt(slotNum)
    }

    fun reset() {
        remoteSlots.clear()
        println("All buttons and slots have been reset. Please re-program.")
    }

    init {
        remoteSlots = ArrayList<CommandSlot>()
    }

}