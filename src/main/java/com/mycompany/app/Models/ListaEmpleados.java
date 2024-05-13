package com.mycompany.app.Models;

public class ListaEmpleados {

    //punteros
    protected Nodo inicio, fin;

    //constructor
    public ListaEmpleados() {
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar al inicio 
    public void agregarInicio(Empleado empleado) {
        inicio = new Nodo(empleado, inicio);
        if (fin == null) {
            fin = inicio;
        }
        System.out.println("Registrado");
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public String mostrarLista() {
        String mensaje = "";

        if (estaVacia()) {
            mensaje = "Lista Vacia";
        } else {
            Nodo recorrer = inicio;
            while (recorrer != null) {
                mensaje += "|" + recorrer.getEmpleado().verDetallle() + "|";
                recorrer = recorrer.siguiente;
            }
        }
        return mensaje;
    }

}
