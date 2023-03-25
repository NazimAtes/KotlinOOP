package com.example.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser= User("james",25)

        myUser.age =60
        myUser.name="lars"

        println(myUser.age)
        println(myUser.name)

        /*
        var james=Musician("James","Gitar",55)
        james.age=60
        println(james.age) //Encapsulation; olduğu için buna ulaşamıyorum ama buna istersem ulaşabilirim videoda var izleyebilirisin

        var lars=SuperMusician("lars","Batary",65)
        println(lars.name)
        lars.sing()
         */

    }
}