package com.sujey.tienda.models;

public class SupleVenta {
    private String nombre;
    private double precio;
    private String marca;

    public SupleVenta(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Venta de suplemento: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Marca: " + marca ;
    }
}