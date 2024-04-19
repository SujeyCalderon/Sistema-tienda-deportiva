package com.sujey.tienda.models;

public class Usuario {
    private String tipo = "Administrador";
    private String tipo2 = "Empleado";
    private  String usuario = "sujey";
    private String contrasenia = "calder123";
    private  String usuario2 = "Sheila";
    private String contrasenia2 = "calde123";

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public String getContrasenia2() {
        return contrasenia2;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTipo2() {
        return tipo2;
    }
}
