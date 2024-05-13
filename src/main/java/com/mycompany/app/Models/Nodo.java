package com.mycompany.app.Models;

public class Nodo {

    private Empleado empleado;
    public Nodo siguiente;

    //constructr para insertar al final de la lista
    public Nodo(Empleado empleado) {
        this.empleado = empleado;
        this.siguiente = null;
    }

    //constructor para insertar al inicio de la lista
    public Nodo(Empleado empleado, Nodo nodo) {
        this.empleado = empleado;
        siguiente = nodo;
    }

}
