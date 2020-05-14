package com.example.songkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // my favorite song

        var musicname: String = "faded"

       var  Artist: String  = "AlanWalker"

       var Genre: String = "Electro House"

       var Releaseddate: String = "2nd december twenty 2015"

       val Length: Int = 2012

       var tempo:String = "90-99BPM"

       var Label: String = "Mer Musikk"

        var Songwritters: String = "AlanWalker, Jesper Borgen, Anders Froen, Gunnar Greve Pettersen"

      var  Producer: String = "AlanWalker"

        var Format: String = "CD single, 7-inch Vinyl, digital download"

       var Key: String = "E flat Minor"

        val Recorded: Int = 2015

        print(musicname)

        print(Artist)

        print(Genre)

        print(Releaseddate)

        print(Length)

        print(tempo)

        print(Label)

        print(Songwritters)

        print(Producer)

        print(Key)

        print(Format)

        print(Recorded)

        //my favorite song is faded by Alan Walker. Is IS an electroHouse Music released on the second of december 2015.
        //Its length is 2012 seconds and its tempo is 90-99BPM and label Mer Musikk.
        //It was written by AlanWalker, Jesper Borgen, Anders Froen, Gunnar Greve Pettersen and produced by Alan Walker herself
        //Its format is CD single, 7-inch Vinyl, digital download and at a key of E flat minor

    }
}
