package com.openbootcamp.Datos.Avanzados;

public class Arrays {

    public static void main(String[] args) {
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i : arrayUno){
            System.out.println(i);
        }

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " en posición " + i);
        }

    }

}
