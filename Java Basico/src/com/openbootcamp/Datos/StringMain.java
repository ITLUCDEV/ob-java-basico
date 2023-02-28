package com.openbootcamp.Datos;

public class StringMain {

    public static void main(String[] args) {

        /*
            length() -> Obtiene longitud de caracteres
            startsWith("") ->
            endsWith("") ->
            indexOf("") ->
            subString(1,5)
            trim() -> Retira los espacios
            equals() -> Compara si es igual a
            compareTo
            toUppercase() -> Pasa el texto a mayúsculas


         */

        String mensaje = " Hola mundo ";
        System.out.println(mensaje.length());

        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());

        String otro = "HOLA MUNDO";
        if(mensajeMAY.equals(otro)){
            System.out.println("Verdadero");
        }

    }

}
