package com.openbootcamp.Datos.Avanzados;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(1, 15);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("datos del vector: " + vector);

        vector.remove(2);
        System.out.println("datos del vector: " + vector);

        System.out.println("Vector tamaño " + vector.size() + " capacidad " + vector.capacity());
    }

}
