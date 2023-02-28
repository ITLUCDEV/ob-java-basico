package com.openbootcamp.Datos;

public class SwitchCase {

    public static void main(String[] args) {

        String tiempo = "nublado";

        switch (tiempo){

            case "soleado":
                System.out.println("El tiempo es " + tiempo);
                break;

            case "nublado":
                System.out.println("El tiempo está " + tiempo);
                break;

            default:
                System.out.println("No se ha encontrado el clima actual.");
                break;

        }

    }

}
