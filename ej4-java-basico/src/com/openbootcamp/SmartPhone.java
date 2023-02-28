package com.openbootcamp;

public class SmartPhone extends SmartDevice{

    double largo;
    double ancho;
    int valoracion;

    public SmartPhone(String fabricante, String modelo, int year, double precio, double largo, double ancho, int valoracion) {
        super(fabricante, modelo, year, precio);
        this.largo = largo;
        this.ancho = ancho;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
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
