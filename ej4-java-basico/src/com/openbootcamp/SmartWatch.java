package com.openbootcamp;

public class SmartWatch extends SmartDevice{

    double largo;
    double ancho;
    int valoracion;

    public SmartWatch(String fabricante, String modelo, int year, double precio, double largo, double ancho, int valoracion) {
        super(fabricante, modelo, year, precio);
        this.largo = largo;
        this.ancho = ancho;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", valoracion=" + valoracion +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", precio=" + precio +
                '}';
    }
}
