package com.example.internasyexternascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewApp : AppCompatActivity() {
    private var lvLenguajes: ListView?=null
    private var tvSeleccion:TextView?=null


    private val lenguajes = arrayOf("Kotlin", "Java", "C++", "C#","PHP","vB.net")
    private val posicion = arrayOf("5", "3", "1", "4","2","6")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_app)

        lvLenguajes=findViewById(R.id.lv_Lenguajes)
        tvSeleccion=findViewById(R.id.tv_Seleccion)


        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.list_items_claseprogramacion, lenguajes)

        lvLenguajes?.adapter=adaptador


        lvLenguajes?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                tvSeleccion?.text="la posicion del lenguaje ${lvLenguajes?.getItemAtPosition(position)} es ${posicion[position]}"

            }


        }
    }

}