package com.sujey.tienda.models;

public  class Ropa extends Producto {
    private String talla;
    private String nombre;
    private double precio;

    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
        this.talla= talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return super.toString()+"Ropa: " +'\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Talla: " + talla;
    }
}
