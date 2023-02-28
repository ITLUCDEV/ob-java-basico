package com.openbootcamp.Datos;

public class Array {

    public static void main(String[] args) {

        int[] notas = new int[10]; //usamos los [] para indicar que no es un dato simple, sino una array
        int[] notas2 = {8, 10, 5, 9, 8, 7, 5, 6}; //generamos igualmente un array pero lo asignamos directamente valores

        // Para modificar una de las posiciones del array
        // Recordatorio: En java los arrays comienzan por la posición 0
        notas[0] = 8; // Asignamos para la posición 0 el valor 8
        notas[1] = 9; // Asignamos para la posición 1 el valor 9

        System.out.println(notas[0]); // Printeamos la posición 0 del array notas
        System.out.println(notas2[2]); // Printeamos la posición 2 del array notas2

        for(int i=0; i < notas2.length; i++){
            System.out.println(notas2[i]);
        }

    }

}
