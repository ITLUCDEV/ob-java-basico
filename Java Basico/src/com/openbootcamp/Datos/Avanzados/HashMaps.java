package com.openbootcamp.Datos.Avanzados;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        System.out.println(mapa);
        System.out.println(mapa.get("clave"));

        mapa.replace("clave2", 15);
        System.out.println(mapa);

        mapa.remove("clave2");
        System.out.println(mapa);

        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento clave es: " + elemento.getValue());
        }

    }

}
