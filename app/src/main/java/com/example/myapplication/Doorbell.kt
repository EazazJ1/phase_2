package com.example.myapplication

class Doorbell : Subject {
    var doorbell = false
    private val observerList: MutableList<Observer?>

    override fun registerObserver(o: Observer?)
    {
        observerList.add(o)
    }

    override fun removeObserver(o: Observer?) {
        observerList.remove(o)
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
}