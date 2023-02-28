package com.openbootcamp.Datos;

import com.openbootcamp.Coche;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        // List<tipodedato> identificador
        List<String> nombres = new java.util.ArrayList<>();

        nombres.add("Juan");
        nombres.add("Alberto");
        nombres.add("Manuel");
        nombres.add("Lucho");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new java.util.ArrayList<>();
        coches.add(new Coche("azul", "honda", "civic", 7.95, 4.20));


        System.out.println(coches);


        for (Coche coche: coches){
            System.out.println(coches);
        }
    }

}
