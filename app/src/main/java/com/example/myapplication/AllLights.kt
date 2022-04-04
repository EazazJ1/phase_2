package com.example.myapplication.com.example.myapplication

import com.example.myapplication.CommandSlot





    class AllLights internal constructor() {
        
        var allLightsSlots: ArrayList<CommandSlot>
        
        fun on() {
            println("All lights on")
        }

        fun off() {
            println("All lights off")
        }

        fun addLight(slot: CommandSlot) {
            allLightsSlots.add(slot)
        }

        init {
            allLightsSlots = ArrayList()
        }
    }
