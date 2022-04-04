package com.example.myapplication

import com.example.myapplication.*

fun main()
{
    
    val myRemote = RemoteControl()
    //lights on and off
    val lighton = LightOnCommand()
    val lightoff = LightOffCommand()

    val light = Light()

    lighton.setLight(light)
    lightoff.setLight(light)

    val lightSlot = CommandSlot(lighton, lightoff)

    myRemote.setSlot(lightSlot)
    //lights brightness
    val increaseBrightness = IncreaceBrightnessCommand()
    val decreaseBrightness = DecreaseBrightnessCommand()

    increaseBrightness.setLight(light)
    decreaseBrightness.setLight(light)

    val lightAdjustment = CommandSlot(increaseBrightness, decreaseBrightness)

    myRemote.setSlot(lightAdjustment)

    myRemote.toggleSlot(0)
    //myRemote.toggleSlot(0)

    myRemote.toggleSlot(1,0)
    myRemote.toggleSlot(1,0)
    myRemote.toggleSlot(1,0)
    myRemote.toggleSlot(1,0)
    myRemote.toggleSlot(1,1)


    val newDoorbell = Doorbell()
    val newUser = User(newDoorbell, "bob")
    val newUser2 = User(newDoorbell, "sally")

    newDoorbell.registerObserver(newUser)
    newDoorbell.registerObserver(newUser2)
    newDoorbell.removeObserver(newUser)

    //have options for rang and answered just for demo purposes
    newDoorbell.doorbellRang()
    newDoorbell.doorbellAnswered()

}