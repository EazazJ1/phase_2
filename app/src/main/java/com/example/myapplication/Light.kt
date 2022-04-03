package com.example.myapplication

 class Light {

    var brightness: Int = 100

        fun on() {
            println("Living room light on")
        }
        fun off() {
            println("Living room light off")
        }

     fun modifyBrightness(newBrightness: Int)
        {
            brightness += newBrightness
            
            if(newBrightness > 100)
            {
                brightness = 100
            }
            else if(newBrightness < 5)
            {
                brightness = 5; //if the user wants to turn it off, they should click the turn off button
            }
            
        }
 }


