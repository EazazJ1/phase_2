package com.example.myapplication

//observer
class User(doorbell: Doorbell, var name:String) : Observer
{
    private var doorbell : Doorbell? = null
    private var doorbellStatus = false
    private var username: String? = null

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

//    fun displayUser() {
//        println("$username")
//    }

    fun getUsername1(): String?{
        val returnname = username
        return returnname
    }

    init {
        this.doorbell = doorbell
        this.username = name
    }

}