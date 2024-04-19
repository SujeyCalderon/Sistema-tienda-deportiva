package com.sujey.tienda.models;

public class RopaVenta {
    private String nombre;
    private double precio;
    private String talla;

    public RopaVenta(String nombre, double precio, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Venta de ropa: " +'\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Talla: " + talla ;
    }
}