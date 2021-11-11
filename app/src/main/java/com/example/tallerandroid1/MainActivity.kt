package com.example.tallerandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Actividad 1
        validarEdad()

        //Actividad 2
        tablaMultiplicar()

        //Actividad 3
        listadoPlataformasMoviles()

        //Actividad 4
        presentarVehiculo()

        //Actividad 5
        ordenar()

        //Actividad 6
        validarCedula()
    }

    //Actividad 1
    private fun validarEdad(){

        val edad = 21

        if ( edad >= 18 ){
            println("Es mayor de edad.")
        } else {
            println("Es menor de edad.")
        }
    }

    //Actividad 2
    private fun tablaMultiplicar(){

        val numero = 4
        val limite = 12

        //Resultados ascendentes
        println("Resultados ascendentes: ")
        for ( i in 0..limite ) {
            val resultado = numero * i
            println("\n$numero*$i = $resultado")
        }

        //Resultados descendentes
        println("Resultados descendentes: ")
        for ( i in limite downTo 0 ) {
            val resultado = numero * i
            println("\n$numero*$i = $resultado")
        }
    }

    //Actividad 3
    private fun listadoPlataformasMoviles() {

        val listaEstudiantes = arrayListOf("BRICEÑO JOAN","ORTEGA IAN","TAPIA ISRAEL",
            "GUAMO EDGAR","QUIZHPE LUIS","VEGA BRANDON","FREIRE RICARDO","JARAMILLO ERICK",
            "MEDINA DANIEL","GARCIA SANTIAGO","SACA FRANK","ROSALES SHOMIRA","CUEVA JEFERSON",
            "VALLEJO ANDRES","ESPARZA JORDY","SALAZAR DAVID","PILLCO DAVID")

        val subGrupo1 = arrayListOf<String>()
        val subGrupo2 = arrayListOf<String>()
        val subGrupo3 = arrayListOf<String>()
        val subGrupo4 = arrayListOf<String>()
        val subGrupo5 = arrayListOf<String>()
        val subGrupo6 = arrayListOf<String>()

        for ( i in 0 until 3)
            subGrupo1.add(listaEstudiantes[i])
        for ( i in 3 until 6)
            subGrupo2.add(listaEstudiantes[i])
        for ( i in 6 until 9)
            subGrupo3.add(listaEstudiantes[i])
        for ( i in 9 until 12)
            subGrupo4.add(listaEstudiantes[i])
        for ( i in 12 until 15)
            subGrupo5.add(listaEstudiantes[i])
        for ( i in 15 until 17)
            subGrupo6.add(listaEstudiantes[i])

        println("Listado completo de estudiantes ordenado:  ${listaEstudiantes.sorted()}")
        println("Grupo 1: $subGrupo1")
        println("Grupo 2: $subGrupo2")
        println("Grupo 3: $subGrupo3")
        println("Grupo 4: $subGrupo4")
        println("Grupo 5: $subGrupo5")
        println("Grupo 6: $subGrupo6")

    }

    //Actividad 4
    private fun presentarVehiculo() {

        val vehiculoEjemplo = Vehiculo( traccion = "FWD", motor = "Motor Híbrido",
            tipoVehiculo = "Deportivo", capacidad = 5)
        vehiculoEjemplo.propiedades()

    }
    //Actividad 5
    private fun ordenar() {

        val numeros = arrayListOf(92,1,52,51,52,63,16,37,27,4,5)
        val tamanio = numeros.size
        val listaNumeros = IntArray(tamanio)
        for (i in (0 until tamanio)){
            listaNumeros[i] = numeros[i]
        }
        var aux = 0
        for(i in (0 until tamanio-1)){
            for(j in (0 until tamanio-1)){
                if(listaNumeros[j] > listaNumeros[j+1]){
                    aux = listaNumeros[j]
                    listaNumeros[j] = listaNumeros[j+1]
                    listaNumeros[j+1] = aux
                }
            }
        }
        println("Números ordenados de forma acendente")
        for (i in (0 until tamanio)){
            println(listaNumeros[i])
        }
    }

    //Actividad 6
    private fun validarCedula(){

        val cedula = "1900615384"
        val cedulaArray = arrayListOf<Int>()
        for( i in cedula.indices ){
            cedulaArray.add(cedula[i].toString().toInt())
        }
        var total = 0

        for( i in 0 until cedulaArray.size - 1 ){

            var multiplicacion = 0

            multiplicacion = if ((i % 2) == 0 ){
                cedulaArray[i] * 2
            } else {
                cedulaArray[i] * 1
            }
            if ( multiplicacion > 9 ) {
                multiplicacion -= 9
            }

            total += multiplicacion
        }

        val ultimoNumero = cedulaArray[cedulaArray.lastIndex]
        val comparar = 30 - total

        if( ultimoNumero == comparar ){
            println("La cédula $cedula es válida")
        } else {
            println("La cédula $cedula es invalida")
        }
    }
}