package com.example.appimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intencion = intent
        val imc = intencion.getFloatExtra("imc", 0.0F)
        val gender = intencion.getStringExtra("gender")
        val age = intencion.getIntExtra("age", 0)

        interpretIMC(imc, age, gender!!)

        tvResultadoIMC.text = "$imc"

        //Log.d("valor_imc","$imc")
        //Log.d("valor_sexo","$sex")
        //Log.d("valor_edad","$age")

        btnNewCalcular.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    fun interpretIMC(imc: Float, edad: Int, sexo: String) {
        var mensaje: String = ""
        var rango: String = ""
        var motivacion: String = ""
        //MUJER
        if (sexo == "f") {
            when (edad) {
                in 19..24 -> {
                    when (imc) {
                        in 18.9..22.1 -> {
                            mensaje = "IBM Optimo"
                            rango = "18,9 - 22.1 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 22.2..29.5 -> {
                            mensaje = "IBM Bueno"
                            rango = "18,9 - 22.1 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 29.6..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "18,9 - 22.1 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 25..29 -> {
                    when (imc) {
                        in 18.9..22.0 -> {
                            mensaje = "IBM Optimo"
                            rango = "18,9 - 22,0 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 22.1..29.7 -> {
                            mensaje = "IBM Bueno"
                            rango = "18,9 - 22,0 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 29.8..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "18,9 - 22,0 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."

                        }
                    }
                }
            }
            when (edad) {
                in 30..34 -> {
                    when (imc) {
                        in 19.7..22.7 -> {
                            mensaje = "IBM Optimo"
                            rango = "19,7 - 22,7 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 22.8..30.4 -> {
                            mensaje = "IBM Bueno"
                            rango = "19,7 - 22,7 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 30.5..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "19,7 - 22,7 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 35..39 -> {
                    when (imc) {
                        in 21.0..24.0 -> {
                            mensaje = "IBM Optimo"
                            rango = "21,0 - 24,0 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 24.1..31.4 -> {
                            mensaje = "IBM Bueno"
                            rango = "21,0 - 24,0 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 31.5..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "21,0 - 24,0 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 40..44 -> {
                    when (imc) {
                        in 22.6..25.6 -> {
                            mensaje = "IBM Optimo"
                            rango = "22,6 - 25,6 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 25.7..32.7 -> {
                            mensaje = "IBM Bueno"
                            rango = "22,6 - 25,6 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 38.8..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "22,6 - 25,6 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 45..49 -> {
                    when (imc) {
                        in 24.3..27.3 -> {
                            mensaje = "IBM Optimo"
                            rango = "24,3 - 27,3 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 27.4..34.0 -> {
                            mensaje = "IBM Bueno"
                            rango = "24,3 - 27,3 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 34.1..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "24,3 - 27,3 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 50..54 -> {
                    when (imc) {
                        in 26.6..29.7 -> {
                            mensaje = "IBM Optimo"
                            rango = "26,6 - 29,7 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 29.8..36.1 -> {
                            mensaje = "IBM Bueno"
                            rango = "26,6 - 29,7 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 36.2..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "26,6 - 29,7 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 55..59 -> {
                    when (imc) {
                        in 27.4..30.7 -> {
                            mensaje = "IBM Optimo"
                            rango = "27,4 - 30,7 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 30.8..37.2 -> {
                            mensaje = "IBM Bueno"
                            rango = "27,4 - 30,7 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 37.3..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "27,4 - 30,7 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 60..110 -> {
                    when (imc) {
                        in 27.6..31.0 -> {
                            mensaje = "IBM Optimo"
                            rango = "27,6 - 31,0 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 31.1..37.9 -> {
                            mensaje = "IBM Bueno"
                            rango = "27,6 - 31,0 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 38.0..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "27,6 - 31,0 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            //HOMBRE
        } else if (sexo == "m") {
            when (edad) {
                in 19..24 -> {
                    when (imc) {
                        in 10.8..14.9 -> {
                            mensaje = "IBM Optimo"
                            rango = "10,8 - 14,9 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 15.0..23.2 -> {
                            mensaje = "IBM Bueno"
                            rango = "10,8 - 14,9 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 23.3..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "10,8 - 14,9 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 25..29 -> {
                    when (imc) {
                        in 12.8..16.5 -> {
                            mensaje = "IBM Optimo"
                            rango = "12,8 - 16,5 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 16.6..24.3 -> {
                            mensaje = "IBM Bueno"
                            rango = "12,8 - 16,5 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 24.4..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "12,8 - 16,5 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 30..34 -> {
                    when (imc) {
                        in 14.5..18.0 -> {
                            mensaje = "IBM Optimo"
                            rango = "14,5 - 18,0 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 18.1..25.1 -> {
                            mensaje = "IBM Bueno"
                            rango = "14,5 - 18,0 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 25.2..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "14,5 - 18,0 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 35..39 -> {
                    when (imc) {
                        in 16.1..19.4 -> {
                            mensaje = "IBM Optimo"
                            rango = "16,1 - 19,4 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 19.5..26.0 -> {
                            mensaje = "IBM Bueno"
                            rango = "16,1 - 19,4 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 26.1..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "16,1 - 19,4 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 40..44 -> {
                    when (imc) {
                        in 17.5..20.5 -> {
                            mensaje = "IBM Optimo"
                            rango = "17,5 - 20,5 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 20.6..26.8 -> {
                            mensaje = "IBM Bueno"
                            rango = "17,5 - 20,5 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 26.9..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "17,5 - 20,5 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 45..49 -> {
                    when (imc) {
                        in 18.6..21.5 -> {
                            mensaje = "IBM Optimo"
                            rango = "18,6 - 21,5 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 21.6..27.5 -> {
                            mensaje = "IBM Bueno"
                            rango = "18,6 - 21,5 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 27.6..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "18,6 - 21,5 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 50..54 -> {
                    when (imc) {
                        in 19.8..22.7 -> {
                            mensaje = "IBM Optimo"
                            rango = "19,8 - 22,7 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 22.8..28.6 -> {
                            mensaje = "IBM Bueno"
                            rango = "19,8 - 22,7 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 28.7..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "19,8 - 22,7 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 55..59 -> {
                    when (imc) {
                        in 20.2..23.2 -> {
                            mensaje = "IBM Optimo"
                            rango = "20,2 - 23,2 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 23.3..29.2 -> {
                            mensaje = "IBM Bueno"
                            rango = "20,2 - 23,2 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 29.3..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "20,2 - 23,2 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }
            when (edad) {
                in 60..110 -> {
                    when (imc) {
                        in 20.3..23.5 -> {
                            mensaje = "IBM Optimo"
                            rango = "20,3 - 23,5 kg/m2"
                            motivacion = "You have a normal body weight. Good job!"
                        }
                        in 23.6..29.7 -> {
                            mensaje = "IBM Bueno"
                            rango = "20,3 - 23,5 kg/m2"
                            motivacion = "You must do some work on your health. Let's go!"
                        }
                        in 29.8..70.0 -> {
                            mensaje = "Padeces Obesidad"
                            rango = "20,3 - 23,5 kg/m2"
                            motivacion = "Alert! You must exercise and eat healthy."
                        }
                    }
                }
            }

        }
        tvMensajeFinal.text = mensaje
        tvRango.text = rango
        tvMensajeMotivacional.text = motivacion
    }
}