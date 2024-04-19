package com.sujey.tienda.models;

public class AccesoriosVenta {
    private String nombre;
    private double precio;
    private String tipo;

    public AccesoriosVenta(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Venta de accesorio: " +'\n' +
                "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Tipo: " + tipo ;
    }
}