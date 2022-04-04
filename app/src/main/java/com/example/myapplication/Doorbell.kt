package com.example.myapplication

class Doorbell : Subject {
    private var doorbell = false
    private val observerList: MutableList<User?>

    override fun registerObserver(o: User?)
    {
        observerList.add(o)
    }

    override fun removeObserver(index: Int) {
        observerList.removeAt(index)
        //observerList.remove()
    }

    override fun notifyObservers() {
        for (observer in observerList) {
            observer!!.update()
        }
    }

    fun doorbellRang() {
        this.doorbell = true
        notifyObservers()
    }

    fun doorbellAnswered() {
        this.doorbell = false
        notifyObservers()
    }

    init {
        observerList = ArrayList()
    }

    fun getDoorbellStatus(): Boolean?
    {
        return doorbell
    }
    fun displayObservers()
    {

        var i = 0
        while(i < observerList.size)
        {
            var print = observerList[i]?.getUsername1()
            println("$i. $print")
            ++i
        }
    }
}