package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ejercicio = new ArrayList<>();
        ejercicio.add("prueba");
        ejercicio.add("test");
        ejercicio.add("probando");
        ejercicio.add("practicando");

        LinkedList<String> ejercicios = new LinkedList<>(ejercicio);

        System.out.println("Valores del arrayList:");
        for (String elemento : ejercicio) {
            System.out.println(elemento);
        }

        System.out.println("Valores de la linkedList:");
        for (String elemento : ejercicios) {
            System.out.println(elemento);
        }

        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; arrayList.size() < 5; i++){
            if (i % 2 != 0){
                arrayList.add(i);
            }
        }
        for (Integer elemento : arrayList){
            System.out.println(elemento);
        }

        // Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        dividePorCero(10);

    }

    public static void dividePorCero(int num) {
        try {
            int resultado = num / 0;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: " + e);
        }finally {
            System.out.println("Demo de código");
        }

    }

}
