package com.example.internasyexternascalculadora

class miClaseAnidadayInterna {
    //clase anidada es una clase que puede estar dentro de otra clase

    private val uno =1

    private fun retornarUno():Int{
        return uno
    }

    class miClaseAnidada{

        fun suma(n1:Int,n2:Int):Int{
            return n1+n2
        }

    }
    //inner, permite el acseso a las otras clases
    inner class miClaseInterna(){
        fun sumarDos(num:Int):Int{
            return num + uno + retornarUno()



        }



    }
}