/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectot3;

/**
 *
 * @author Dell
 */

// Superclase Persona
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

// Subclase Doctor
class Doctor extends Persona {

    public Doctor(String nombre, int edad) {
        super(nombre, edad);
    }
}
//
// Subclase Deportista
class Deportista extends Persona {

    public Deportista(String nombre, int edad) {
        super(nombre, edad);
    }
}

// Clase principal para probar las subclases
public class ProyectoT3 {
    public static void main(String[] args) {
    }
}
