package com.sujey.tienda.models;

import java.util.ArrayList;

public class Administracion {
    private ArrayList<Accesorio> listAccesorio = new ArrayList<>();
    private ArrayList<Suplemento> listSuplemento = new ArrayList<>();
    private ArrayList<Ropa> listRopa = new ArrayList<>();
    private ArrayList<AccesoriosVenta> listVentaAc = new ArrayList<>();
    private ArrayList<SupleVenta> listVentaSu = new ArrayList<>();
    private ArrayList<RopaVenta> listVentaRo = new ArrayList<>();

    public ArrayList<AccesoriosVenta> getListVentaAc() {
        return listVentaAc;
    }

    public ArrayList<SupleVenta> getListVentaSu() {
        return listVentaSu;
    }

    public ArrayList<RopaVenta> getListVentaRo() {
        return listVentaRo;
    }

    public ArrayList<Accesorio> getListAccesorio() {
        return listAccesorio;
    }

    public ArrayList<Suplemento> getListSuplemento() {
        return listSuplemento;
    }

    public ArrayList<Ropa> getListRopa() {
        return listRopa;
    }

    public boolean addAccesoriosVenta(AccesoriosVenta venta) {
        return listVentaAc.add(venta);
    }

    public boolean addSupleVenta(SupleVenta venta2) {
        return listVentaSu.add(venta2);
    }

    public boolean addRopaVenta(RopaVenta venta3) {
        return listVentaRo.add(venta3);
    }

    public boolean addAccesorio(Accesorio accesorio) {
        return listAccesorio.add(accesorio);
    }

    public boolean addSuplemento(Suplemento suplemento) {
        return listSuplemento.add(suplemento);
    }

    public boolean addRopa(Ropa ropa) {
        return listRopa.add(ropa);
    }
    public boolean verificarDisponibilidad(String nombre, double precio, String talla) {
        for (Accesorio accesorio : listAccesorio) {
            if (accesorio.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }

        for (Suplemento suplemento : listSuplemento) {
            if (suplemento.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }

        for (Ropa ropa : listRopa) {
            if (ropa.getNombre().equalsIgnoreCase(nombre) && ropa.getTalla().equalsIgnoreCase(talla)) {
                return true;
            }
        }

        return false;
    }
}