package com.example.appimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad:Int = 21
    var peso:Int = 53
    var altura:Int = 172
    var sexo:String = "m"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekAltura.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                    tvAltura.text = "$progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btnEdadSumar.setOnClickListener(this)
        btnEdadRestar.setOnClickListener(this)
        btnPesoSumar.setOnClickListener(this)
        btnPesoRestar.setOnClickListener(this)
        btnFemenino.setOnClickListener(this)
        btnMasculino.setOnClickListener(this)
        btnCalcular.setOnClickListener(this)

        tvPeso.text = "$peso"
        tvEdad.text = "$edad"
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            //EDAD
            R.id.btnEdadSumar->{
                edad++
                tvEdad.text = "$edad"
            }
            R.id.btnEdadRestar->{
                edad--
                tvEdad.text = "$edad"
            }
            //PESO
            R.id.btnPesoSumar->{
                peso++
                tvPeso.text = "$peso"
            }
            R.id.btnPesoRestar->{
                peso--
                tvPeso.text = "$peso"
            }
            //SEXO
            R.id.btnFemenino->sexo="f"
            R.id.btnMasculino->sexo="m"
            //CALCULAR IMC
            R.id.btnCalcular->{
                val imc = calculaIMC(peso,altura)
                val intencion = Intent(this,SegundaActivity::class.java)
                intencion.putExtra("imc",imc)
                intencion.putExtra("gender",sexo)
                intencion.putExtra("age",edad)
                startActivity(intencion)
            }

        }
    }
    fun calculaIMC(peso:Int, altura:Int):Float{
        val pesoF = peso.toFloat()
        val alturaF = altura.toFloat()/100
        var imc = pesoF/(alturaF*alturaF)
        return imc.toFloat()
    }
}