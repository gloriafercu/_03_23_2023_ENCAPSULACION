package com.adecco.presentacion;

import com.adecco.modelo.Producto; // ruta de la clase Producto en Main

public class Main {
    public static void main(String[] args) {
        /* Instanciar el objeto Producto
        Como tengo los atributos en modo privado no puedo acceder desde aquí a los atributos de la clase Producto. Para poder acceder a ellos tengo que hacer SETTER Y GETTERS (modo público).
        Al hacer los setters y los getters ya puedo dar valor a mis atributos.*/
        Producto p1 = new Producto();

        p1.setNumProducto(1);
        System.out.println("IdProducto: " + p1.getNumProducto());
        p1.setNombreProducto("Ratón inalámbrico");
        System.out.println("Nombre producto: " + p1.getNombreProducto());
        p1.setPrecio(15.2);
        System.out.println("Precio: " + p1.getPrecio());
        p1.setCantidadExistencia(5);
        System.out.println("Cantidad en existencia: " + p1.getCantidadExistencia());
    }
}