package com.example.tallerandroid1

class Vehiculo( val traccion: String, val motor: String, val tipoVehiculo: String, val capacidad: Int) {

    fun propiedades() {
        println("Propiedades del vehículo:\n" +
                "Tracción: $traccion\n" +
                "Motor: $motor\n" +
                "Tipo de vehículo: $tipoVehiculo\n" +
                "Capacidad: $capacidad")
    }
}