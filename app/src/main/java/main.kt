package com.example.myapplication

import com.example.myapplication.com.example.myapplication.CommandSlot
import com.example.myapplication.com.example.myapplication.LightOffCommand
import com.example.myapplication.com.example.myapplication.LightOnCommand
import com.example.myapplication.com.example.myapplication.RemoteControl

fun main()
{
    
    val myRemote = RemoteControl()

    val lighton = LightOnCommand()
    val lightoff = LightOffCommand()

    val light = Light()

    lighton.setLight(light)
    lightoff.setLight(light)

    val lightSlot = CommandSlot(lighton, lightoff)

    myRemote.setSlot(lightSlot)

    myRemote.toggleSlot(0)
    myRemote.toggleSlot(0)

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