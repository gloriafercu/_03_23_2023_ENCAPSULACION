package com.adecco.modelo;
/**
 * CREACIÓN DE LA CLASE "PRODUCTO": Es una plantilla de la clase
 * 1.- Atributos
 * 2.-  Métodos
 * 3.- Constructores
 * 4.- Setters y Getters
* */
public class Producto {
    // 1. Atributos
    // Tengo los atributos en modo privado y solo puedo ver los desde la misma clase
    private int numProducto;
    private String nombreProducto;
    private double precio;
    private int cantidadExistencia;
    // 2. Métodos
    // 3. Setters y Getters (modo público siempre)
        // a) SETTER: asignar el valor de mi atributo en el objeto por eso se le pasa un argumento
    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    // b) GETTER: devolver el valor de lo que tengo almacenado en mi objeto
    public int getNumProducto() {
        return numProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }
}
