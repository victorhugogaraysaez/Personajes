package com.example.personajes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    private var name = ""
    private var job = ""

    var nameText: EditText? = null
    var ageText: EditText? = null
    var jobText: EditText? = null
    var resultText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameText =findViewById(R.id.nameText)
        ageText =findViewById(R.id.ageText)
        jobText =findViewById(R.id.jobText)
        resultText =findViewById(R.id.resultText)

        val Ash = Pokemon ("Ash Ketchum", 10 , "Entrenador")
        Ash.hairColor= "Negro"
    }

    fun makePersonaje(view :View){
        name =nameText.toString()
        var age =ageText.toString().toIntOrNull()
            if (age == null){
                age = 0
            }
        job = jobText.toString()

        val personaje = Pokemon(name, age, job)

        var resultado = "Nombre; ${personaje.name} , Edad: ${personaje.age}, Trabajo: ${personaje.job} "
        /* android studio no le gusta como estamos pasando los datos a la string*/
        resultText!!.text = resultado
        /* aca se imprime codigo y no la cadena con los datos de Ash o los que se hayan ingresado */
    }
}