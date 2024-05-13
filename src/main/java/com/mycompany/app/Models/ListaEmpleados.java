package com.mycompany.app.Models;

import javax.swing.JTextArea;

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
        if (!estaVacia()) {
            //creamos el nodo 
            fin.siguiente = new Nodo(empleado);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(empleado);
        }
        System.out.println("Registrado");
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void mostrarLista(JTextArea texDatos) {
        String mensaje = "";

        if (estaVacia()) {
            mensaje = "Lista Vacia";
        } else {
            Nodo recorrer = inicio;
            while (recorrer != null) {
                mensaje += "\n|" + recorrer.getEmpleado().verDetallle() + "|";
                recorrer = recorrer.siguiente;
            }
        }
        texDatos.setText(mensaje);
    }

}
