package com.example.myapplication

interface Subject {
    fun registerObserver(o: User?)
    //fun removeObserver(o: User?)
    fun removeObserver(index: Int)
    fun notifyObservers()
}