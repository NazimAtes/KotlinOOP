package com.example.kotlinoop

class User {


    //property (özellikler) yani benim  user sınıfımda objelerin isim ve yaş özellikleri olabilir
    var name : String?= null
    var age : Int?= null

    //Constructor ve İnit= bir sınıfta her bir obje oluşturulduğunda çağrılan ilk fonksiyonlar .

    constructor(nameInput: String,ageInput:Int){
        this.name=nameInput
        this.age=ageInput

        println("kullanıci olusturuldu.")
    }
    init {
        println("init")

    }
}