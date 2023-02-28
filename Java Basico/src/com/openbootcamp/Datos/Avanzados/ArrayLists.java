package com.openbootcamp.Datos.Avanzados;

import java.util.ArrayList;
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");
        System.out.println("contenido: " + lista);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for(Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }
    }

}
