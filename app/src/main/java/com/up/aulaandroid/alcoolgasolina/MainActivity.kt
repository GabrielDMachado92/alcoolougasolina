package com.up.aulaandroid.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCalcular(view: View){
        calcular();
    }

    private fun calcular(){

        textResultadoGasAlc.text = "";
        txtValorMaxAlcool.text = "";

        if(valorAlcool.text.toString().isEmpty() || valorGasolina.text.toString().isEmpty()){
            textResultadoGasAlc.text = "Digite valores nos campos de Gasolina e alcool";
        } else if(valorAlcool.text.toString().toDouble() <= 0 || valorAlcool.text.toString().toDouble() <=0){
            textResultadoGasAlc.text = "Digite valores válidos nos campos de Gasolina e alcool";
        } else {

            val alcool = valorAlcool.text.toString().toDouble();

            val gasolina = valorGasolina.text.toString().toDouble();

            val maxAlcool: Double = (gasolina * 0.7);



            if (alcool <= maxAlcool) {
                textResultadoGasAlc.text = "Alcool é top";
            } else {
                textResultadoGasAlc.text = "Gasolina é top";
            }

            txtValorMaxAlcool.text = maxAlcool.toString().subSequence(0, 4);
        }

    }


}
