package com.sujey.tienda.models;

public class Suplemento extends Producto {
    private String nombre;
    private double precio;
    private String marca;

    public Suplemento(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
        this.marca= marca;
    }

    @Override
    public String toString() {
        return super.toString()+"Suplementos: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Marca: " + marca;
    }
}