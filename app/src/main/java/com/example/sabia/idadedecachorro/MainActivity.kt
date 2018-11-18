package com.example.sabia.idadedecachorro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btCalcular(view: View){
        val idade = editText_idade.text.toString()

        val validaCampos = validarCampos(idade)

        if(validaCampos){
            calcularIdade(idade)
        }else{
            text_resultado.setText("Prencha a idade primeiro!")
        }

    }
    fun calcularIdade(idade: String) {

        val valoridade = idade.toInt()

        val resultadoIdade = valoridade * 7

        text_resultado.setText("A idade do seu cachorro é $resultadoIdade!")
    }


    fun validarCampos(idade: String): Boolean {

        var camposValidados : Boolean = true

        if( idade == null  || idade.equals("")){
            camposValidados = false
        }

        return camposValidados
    }
}
