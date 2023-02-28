package com.openbootcamp;

public class PrecioMain {

    public static void main(String[] args) {
        precio(20);
    }

    public static void precio(int precioSinIva){
        double precioIva = precioSinIva * 1.21;
        System.out.println("El precio sin IVA es " + precioSinIva + "\n" + "El precio con IVA es " + precioIva);

    }

}
