package com.openbootcamp.Datos.Avanzados;

public class Strings {

    public static void main(String[] args) {
        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("Mi cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("Mi cadena ahora es: " + cadenaMayus);

        boolean resultado = cadena.startsWith("Men");
        if (resultado){
            System.out.println("Empieza por lo que quiero.");
        }else {
            System.out.println("No empieza por lo que quiero.");
        }

        for(int i = 0; i < cadena.length(); i++){
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }
    }

}
