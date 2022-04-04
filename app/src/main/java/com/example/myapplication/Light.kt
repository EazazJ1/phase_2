package com.example.myapplication

 class Light {

    var brightness: Int = 50

        fun on() {
            println("Living room light on")
        }
        fun off() {
            println("Living room light off")
        }

     fun modifyBrightness(newBrightness: Int)
        {
            brightness += newBrightness

            if(brightness > 100)
            {
                brightness = 100
                println("Brightness already at max.")
            }
            else if(brightness < 5)
            {
                brightness = 5; //if the user wants to turn it off, they should click the turn off button
                println("Brightness can't be lower than 5.")
            }

            println("Brightness adjusted to $brightness.")
        }
 }


