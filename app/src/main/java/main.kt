package com.example.myapplication

import com.example.myapplication.*

fun toggleOptionInput(): String?
{
    println("1.Toggle");
    val input = readLine()!!
    return input
}
fun adjustmentMenuInput():String?
{
    println("1.Toggle")
    println("2.Increase")
    println("3.Decrease")
    val input = readLine()!!
    return input
}

fun main()
{
    val myRemote = RemoteControl()

    val kitchenLighton = LightOnCommand()
    val kitchenLightoff = LightOffCommand()

    val kitchenLight = Light()
    kitchenLight.setLightName("Kitchen")

    kitchenLighton.setLight(kitchenLight)
    kitchenLightoff.setLight(kitchenLight)

    //slot 0
    val kitchenlightSlot = CommandSlot(kitchenLighton, kitchenLightoff)

    myRemote.setSlot(kitchenlightSlot)
    //lights brightness
    val increaseKitchenBrightness = IncreaceBrightnessCommand()
    val decreaseKitchenBrightness = DecreaseBrightnessCommand()

    increaseKitchenBrightness.setLight(kitchenLight)
    decreaseKitchenBrightness.setLight(kitchenLight)

    //slot 1
    val kitchenLightAdjustment = CommandSlot(increaseKitchenBrightness, decreaseKitchenBrightness)

    myRemote.setSlot(kitchenLightAdjustment)

    //lights on and off
    val livingroomLighton = LightOnCommand()
    val livingroomLightoff = LightOffCommand()

    val LivingRoomLight = Light()
    LivingRoomLight.setLightName("Living Room")

    livingroomLighton.setLight(LivingRoomLight)
    livingroomLightoff.setLight(LivingRoomLight)

    //slot 2
    val LivingroomlightSlot = CommandSlot(livingroomLighton, livingroomLightoff)

    myRemote.setSlot(LivingroomlightSlot)
    //lights brightness
    val increaseBrightness = IncreaceBrightnessCommand()
    val decreaseBrightness = DecreaseBrightnessCommand()

    increaseBrightness.setLight(LivingRoomLight)
    decreaseBrightness.setLight(LivingRoomLight)

    //slot 3
    val livingRoomLightAdjustment = CommandSlot(increaseBrightness, decreaseBrightness)

    myRemote.setSlot(livingRoomLightAdjustment)

    //Door
    val doorUnlock = DoorUnLockCommand()
    val doorLocked = DoorLockCommand()

    val door = Door()

    doorUnlock.setDoor(door)
    doorLocked.setDoor(door)

    //slot 4
    val doorSlot = CommandSlot(doorUnlock, doorLocked)

    myRemote.setSlot(doorSlot)

    //Garage Door
    val garageOpen = GarageDoorOpen()
    val garageClosed = GarageDoorClosed()

    val garage = Garage()

    garageOpen.setGarage(garage)
    garageClosed.setGarage(garage)

    //slot 5
    val garageSlot = CommandSlot(garageOpen, garageClosed)

    myRemote.setSlot(garageSlot)



    //Radio On and Off
    val radioOn = RadioOnCommand()
    val radioOff = RadioOffCommand()

    val radio = Radio()

    radioOn.setRadio(radio)
    radioOff.setRadio(radio)

    //slot 6
    val radioSlot = CommandSlot(radioOn, radioOff)

    myRemote.setSlot(radioSlot)

    //Radio Volume Control
    val volumeUp = IncreaseVolumeCommand()
    val volumeDown = DecreaseVolumeCommand()
    volumeUp.setRadio(radio)
    volumeDown.setRadio(radio)

    //slot 7
    val radioVolumeSlot =  CommandSlot(volumeUp, volumeDown)

    myRemote.setSlot(radioVolumeSlot)

    //TV on and off
    val tvOn = TVOnCommand()
    val tvOff = TVOffCommand()

    val tv = TV()

    tvOn.setTV(tv)
    tvOff.setTV(tv)

    //slot 8
    val tvSlot = CommandSlot(tvOn, tvOff)

    myRemote.setSlot(tvSlot)

    //window shutters open and close
    val shutterOpen = WindowOnCommand()
    val shuttersClosed = WindowOffCommand()

    val shutters = Window()

    shutterOpen.setWindow(shutters)
    shuttersClosed.setWindow(shutters)

    //slot 9
    val shuttersSlot = CommandSlot(shutterOpen, shuttersClosed)

    myRemote.setSlot(shuttersSlot)


    var repeat = true
    while(repeat) {


        println("Welcome to Smart Home Control. Please select one of the following buttons to toggle:")
        println("1.Light")
        println("2.Door")
        println("3.Garage Door")
        println("4.Doorbell")
        println("5.Window")
        println("6.TV")
        println("7.Radio")
        println("8.Users")
        println("9..Exit")
9
        val deviceInput = readLine()!!

        if (deviceInput == "1" || deviceInput == "Light") {
            println("Select a light that you want to toggle:")
            println("1.Kitchen Light");
            println("2.Living Room Light")
            val input = readLine()!!

            val menuInput = adjustmentMenuInput()

            if (input == "1" && menuInput == "1") {
                //toggle Kitchen Light
                myRemote.toggleSlot(0)
            } else if (input == "2" && menuInput == "1") {
                //turn ontoggle Living Room light
                myRemote.toggleSlot(2)
            } else if (input == "1" && menuInput == "2") {
                //Increase Kitchen light
                myRemote.toggleSlot(1, 0)
            } else if (input == "1" && menuInput == "3") {
                //decrease kitchen light
                myRemote.toggleSlot(1, 1)
            } else if (input == "2" && menuInput == "2") {
                //increase living room light
                myRemote.toggleSlot(3, 0)
            } else if (input == "2" && menuInput == "3") {
                //decrease living room light
                myRemote.toggleSlot(3, 1)
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "2" || deviceInput == "Door") {
            val input = toggleOptionInput()
            if (input == "1") {
                //toggle door
                myRemote.toggleSlot(4)
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "3" || deviceInput == "Garage Door") {
            val input = toggleOptionInput()
            if (input == "1") {
                //toggle garage door
                myRemote.toggleSlot(5)

            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "4" || deviceInput == "Doorbell") {
            println("1.Ring")
            println("2.Answer")
            val input = readLine()!!
            if (input == "1") {
                //ring bell
            } else if (input == "2") {
                //answer bell
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "5" || deviceInput == "Window") {
            val input = toggleOptionInput()
            if (input == "1") {
                //toggle window
                myRemote.toggleSlot(9)
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "6" || deviceInput == "TV") {
            val input = toggleOptionInput()
            if (input == "1") {
                //toggleTV
                myRemote.toggleSlot(8)
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "7" || deviceInput == "Radio") {
            val input = adjustmentMenuInput()
            if (input == "1") {
                //toggle radio
                myRemote.toggleSlot(6)
            } else if (input == "2") {
                //+ volume
                myRemote.toggleSlot(7, 0)
            } else if (input == "3") {
                //- volume
                myRemote.toggleSlot(7, 1)
            } else {
                println("Invalid Input")
            }
        } else if (deviceInput == "8" || deviceInput == "Users") {

        }
        else if (deviceInput == "9" || deviceInput == "Exit") {
            repeat = false
        }
    }
//   val myRemote = RemoteControl()
//
//    val kitchenLighton = LightOnCommand()
//    val kitchenLightoff = LightOffCommand()
//
//    val kitchenLight = Light()
//
//    kitchenLighton.setLight(kitchenLight)
//    kitchenLightoff.setLight(kitchenLight)
//
//    //slot 0
//    val kitchenlightSlot = CommandSlot(kitchenLighton, kitchenLightoff)
//
//    myRemote.setSlot(kitchenlightSlot)
//    //lights brightness
//    val increaseKitchenBrightness = IncreaceBrightnessCommand()
//    val decreaseKitchenBrightness = DecreaseBrightnessCommand()
//
//    increaseKitchenBrightness.setLight(kitchenLight)
//    decreaseKitchenBrightness.setLight(kitchenLight)
//
//    //slot 1
//    val kitchenLightAdjustment = CommandSlot(increaseKitchenBrightness, decreaseKitchenBrightness)
//
//    myRemote.setSlot(kitchenLightAdjustment)
//
//    //lights on and off
//    val livingroomLighton = LightOnCommand()
//    val livingroomLightoff = LightOffCommand()
//
//    val LivingRoomLight = Light()
//
//    livingroomLighton.setLight(LivingRoomLight)
//    livingroomLightoff.setLight(LivingRoomLight)
//
//    //slot 2
//    val LivingroomlightSlot = CommandSlot(livingroomLighton, livingroomLightoff)
//
//    myRemote.setSlot(LivingroomlightSlot)
//    //lights brightness
//    val increaseBrightness = IncreaceBrightnessCommand()
//    val decreaseBrightness = DecreaseBrightnessCommand()
//
//    increaseBrightness.setLight(LivingRoomLight)
//    decreaseBrightness.setLight(LivingRoomLight)
//
//    //slot 3
//    val livingRoomLightAdjustment = CommandSlot(increaseBrightness, decreaseBrightness)
//
//    myRemote.setSlot(livingRoomLightAdjustment)
//
//    //Door
//    val doorUnlock = DoorUnLockCommand()
//    val doorLocked = DoorLockCommand()
//
//    val door = Door()
//
//    doorUnlock.setDoor(door)
//    doorLocked.setDoor(door)
//
//    //slot 4
//    val doorSlot = CommandSlot(doorUnlock, doorLocked)
//
//    myRemote.setSlot(doorSlot)
//
//    //Garage Door
//    val garageOpen = GarageDoorOpen()
//    val garageClosed = GarageDoorClosed()
//
//    val garage = Garage()
//
//    garageOpen.setGarage(garage)
//    garageClosed.setGarage(garage)
//
//    //slot 5
//    val garageSlot = CommandSlot(garageOpen, garageClosed)
//
//    myRemote.setSlot(garageSlot)
//
//
//
//    //Radio On and Off
//    val radioOn = RadioOnCommand()
//    val radioOff = RadioOffCommand()
//
//    val radio = Radio()
//
//    radioOn.setRadio(radio)
//    radioOff.setRadio(radio)
//
//    //slot 6
//    val radioSlot = CommandSlot(radioOn, radioOff)
//
//    myRemote.setSlot(radioSlot)
//
//    //Radio Volume Control
//    val volumeUp = IncreaseVolumeCommand()
//    val volumeDown = DecreaseVolumeCommand()
//    volumeUp.setRadio(radio)
//    volumeDown.setRadio(radio)
//
//    //slot 7
//    val radioVolumeSlot =  CommandSlot(volumeUp, volumeDown)
//
//    myRemote.setSlot(radioVolumeSlot)
//
//    //TV on and off
//    val tvOn = TVOnCommand()
//    val tvOff = TVOffCommand()
//
//    val tv = TV()
//
//    tvOn.setTV(tv)
//    tvOff.setTV(tv)
//
//    //slot 8
//    val tvSlot = CommandSlot(tvOn, tvOff)
//
//    myRemote.setSlot(tvSlot)
//
//    //window shutters open and close
//    val shutterOpen = WindowOnCommand()
//    val shuttersClosed = WindowOffCommand()
//
//    val shutters = Window()
//
//    shutterOpen.setWindow(shutters)
//    shuttersClosed.setWindow(shutters)
//
//    //slot 9
//    val shuttersSlot = CommandSlot(shutterOpen, shuttersClosed)
//
//    myRemote.setSlot(shuttersSlot)
//



//    myRemote.toggleSlot(0)
//    //myRemote.toggleSlot(0)
//
//    myRemote.toggleSlot(1,0)
//    myRemote.toggleSlot(1,0)
//    myRemote.toggleSlot(1,0)
//    myRemote.toggleSlot(1,0)
//    myRemote.toggleSlot(1,1)
//
//
//    val newDoorbell = Doorbell()
//    val newUser = User(newDoorbell, "bob")
//    val newUser2 = User(newDoorbell, "sally")
//
//    newDoorbell.registerObserver(newUser)
//    newDoorbell.registerObserver(newUser2)
//    newDoorbell.removeObserver(newUser)
//
//    //have options for rang and answered just for demo purposes
//    newDoorbell.doorbellRang()
//    newDoorbell.doorbellAnswered()

}