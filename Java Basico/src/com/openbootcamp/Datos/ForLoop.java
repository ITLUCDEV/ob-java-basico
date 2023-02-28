package com.openbootcamp.Datos;

public class ForLoop {

    public static void main(String[] args) {

        // 3 argumentos | Fase de inicialización ; Condición de parada ; Condición de paso
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " Hola mundo");
            if(i<3){
                System.out.println("Probando if");
            }
        }
        System.out.println("Fin");


        String[] nombres = {"Pepe", "Juan", "Carlos"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

    }

}
