package com.richdev.objectorientedprogramming

class MySecondCars {
    var name: String? = null
    var model: Int? = null
        private set
                get

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}