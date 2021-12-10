package com.example.tap_u5_ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //camponombrepersona.setText("Alan Covarrubias")
        botonsaludo.setOnClickListener {
            var nombre = camponombrepersona.text.toString()
            if(nombre.isEmpty()==true){
                AlertDialog.Builder(this)
                    .setTitle("¡Error!")
                    .setMessage("El campo de nombre está vacío.")
                    .setPositiveButton("Ok.",{d,i ->})
                    .show()
            }else{
            var alerta = AlertDialog.Builder(this)

            alerta.setTitle("¡ATENCIÓN!")
            alerta.setMessage("Hola, ${nombre}, ¿Cómo estás?")
            alerta.setPositiveButton("Aceptar",{d,i ->
                d.dismiss()
            })
            alerta.setNegativeButton("Cancelar",{d,i ->
                d.cancel()
            })
            alerta.show()
            }
        }
        radioButton.setOnClickListener {
            Toast.makeText(this,"Usted es casado.",Toast.LENGTH_LONG).show()
        }
        radioButton2.setOnClickListener {
            Toast.makeText(this,"Usted es soltero.",Toast.LENGTH_LONG).show()
        }
    }
}