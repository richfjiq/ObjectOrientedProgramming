package com.richdev.objectorientedprogramming.interfaces

interface CanGo {
    fun go() {
        println("vehicles can go.")
    }

    val name: String
        get() = "Ferrari"
}