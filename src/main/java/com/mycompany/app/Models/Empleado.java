package com.mycompany.app.Models;

public class Empleado {

    //atributos
    private final int codigo;
    private String nombre;
    private String tipoContrato;
    private float sueldo;
    private float montoMovilidad;
    private int minutosTardanza;
    private static int id;

    //constructor
    public Empleado(int codigo, String nombre, String tipoContrato, float sueldo, float montoMovilidad, int minutosTardanza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
        this.montoMovilidad = montoMovilidad;
        this.minutosTardanza = minutosTardanza;
        id++;
    }

    //getters y setters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getMontoMovilidad() {
        return montoMovilidad;
    }

    public void setMontoMovilidad(float montoMovilidad) {
        this.montoMovilidad = montoMovilidad;
    }

    public int getMinutosTardanza() {
        return minutosTardanza;
    }

    public void setMinutosTardanza(int minutosTardanza) {
        this.minutosTardanza = minutosTardanza;
    }

   
    public String verDetallle() {
        return "Empleado " + id
                + "\nCodigo: " + codigo
                + "\nNombre: " + nombre
                + "\nTipo Contrato: " + tipoContrato
                + "\nSueldo: " + sueldo
                + "\nMonto Movilidad: " + montoMovilidad
                + "\nMinutos Tardanza: " + minutosTardanza;
    }

}
