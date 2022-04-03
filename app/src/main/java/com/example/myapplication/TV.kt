package com.example.myapplication

 class TV {

        var tvVolume: Int = 100

        fun on() {
            println("TV on")
        }
        fun off() {
            println("TV off")
        }

        fun modifyTvVolume(newTvVolume: Int)
        {
            tvVolume += newTvVolume

            if(newTvVolume>100)
            {
                tvVolume = 100
            }
            else if(newTvVolume <0)
            {
                tvVolume = 0 //if the user wants to turn it off, they should click the turn off button
            }
        }
 }