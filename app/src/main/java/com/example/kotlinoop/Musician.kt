package com.example.kotlinoop

open class Musician(name: String, insttument: String, age: Int) {

    //Encapsulation(hapsetmek): private yapmak "encapsulation" yapmanın en kolay yolu.

    var name:String?= name
        private set
        get
    private var instrument: String?= insttument
    var age:Int?= age
        private set
        get

}