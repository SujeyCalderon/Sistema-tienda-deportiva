package com.sujey.tienda.models;

public class Accesorio extends Producto {

    private String tipo;

    public Accesorio(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Accesorios: " +'\n' +
                "Nombre: " + nombre + '\n' +
                " Precio: " + precio + '\n' +
                " Tipo: " + tipo;
    }
}