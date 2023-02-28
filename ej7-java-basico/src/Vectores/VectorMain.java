package Vectores;

import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(2);
        vector.remove(3);

        System.out.println("Datos del vector: " + vector);

        // En caso de que declarar el vector con la capacidad default y cargarle 1000 elementos, estaríamos produciendo grandes
        // costos de memoria y de rendimiento de manera innecesaria.
    }

}
