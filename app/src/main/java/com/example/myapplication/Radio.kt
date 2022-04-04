package com.example.myapplication

 class Radio {

        var radioVolume: Int = 50

        fun on() {
            println("Radio on")
        }
        fun off() {
            println("Radio off")
        }

        fun modifyRadioVolume(newRadioVolume: Int)
        {
            radioVolume += newRadioVolume

            if(radioVolume > 100)
            {
                radioVolume = 100
                println("Radio volume already at max.")
            }
            else if(radioVolume < 0)
            {
                radioVolume = 0 //if the user wants to turn it off, they should click the turn off button
                println("Radio volume already at 0.")
            }
            println("Current Radio volume is $radioVolume.")
        }
 }