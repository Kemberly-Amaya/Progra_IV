package com.example.funcionesk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrays()
        securityNull()
    }


    fun arrays(){
        val name = "Kemberly"
        val lastname = "Amaya"
        val departament = "Chalatenango"
        val age = "32"

        //crear el arreglo

        var miArray = arrayListOf<String>()

        //anadir los datos

        miArray.add(name)
        miArray.add(lastname)
        miArray.add(departament)
        miArray.add(age)

        println(miArray)

        //anadir conjunto de datos

        miArray.addAll(listOf("Estudiantes", "Programacion IV"))
        println(miArray)

        // acceso a datos
        var miDepart = miArray[2]
        println(miDepart)
        println(miArray[5])

        //modificar

        miArray[0] = "Cata"
        println(miArray[0])

        // eliminar datos

        miArray.removeAt(2)
        println(miArray)

        miArray.forEach{
            println(it)
        }

        // otras operaciones
        println(miArray.count())
        miArray.clear()
        println(miArray.count())
    }

    fun securityNull(){

        // seguridad contra nulos

        var mtString:String = "Programacion IV 13/09/20022"

        //mtString = null esto daria un error de compilacion
        println(mtString)

        //variable seguridad nulla
        var mySecurityNull:String? = "valor de seguridad nula"

        mySecurityNull = null

        println(mySecurityNull)

        mySecurityNull = "le volvemos a dar un valor"
        println(mySecurityNull)

        if(mySecurityNull != null){

            println(mySecurityNull.toString())
        }else{

            println(mySecurityNull.toString())
        }

        println(mySecurityNull?.length)
        mySecurityNull?.let {
            println(it.toString())
        }?: run {

        }
    }

    fun funciones(){

        decirHola()
        DecirNombre("Nelson",22)
        DecirNombre("Juan", 20)

        println(sumarNumeros(9,8))
    }

    fun decirHola(){
        println("Hola estudiantes")
    }

    //funcioconparamtros

    fun DecirNombre(nombre:String, edad:Int){

        println("Hola tu nombre es $nombre y tienes $edad")
    }

    fun sumarNumeros(num:Int, num2:Int):Int{

        val suma = num + num2

        return suma
    }

    fun clases(){

        var st = Estudiante("N",27,arrayOf(Estudiante.lengua.JAVA, Estudiante.lengua.PYTHON))

        println(st.nombre)
        st.edad = 22

        var perosna2 = Estudiante("Nelson", edad = 22, arrayOf(Estudiante.lengua.JAVA,Estudiante.lengua.PHP))
        println(perosna2.codigo())

        println("${perosna2.amigo?.first()?.nombre} es amigo de ${perosna2.nombre}")
    }

}
