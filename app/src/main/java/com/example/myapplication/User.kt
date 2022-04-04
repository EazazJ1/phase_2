package com.example.myapplication

//observer
class User(doorbell: Doorbell, var name:String) : Observer
{
    var doorbell : Doorbell? = null
    var doorbellStatus = false
    var username:String

    override fun update()
    {
        //doorbellStatus = doorbell?.getDoorbellStatus() == true
        //displayRang()

        doorbellStatus = doorbell?.getDoorbellStatus() == true

        if(doorbell?.getDoorbellStatus() == true)
        {
            displayRang()
        }
        else if(doorbell?.getDoorbellStatus() == false)
        {
            displayAnswered()
        }
        //displayRang()
    }


    fun displayRang() {
        println("ALERT FOR $username: The doorbell has been rang")
    }

    fun displayAnswered() {
        println("ALERT FOR $username: The door has been answered")
    }


    init {
        this.doorbell = doorbell
        this.username = name
    }

}