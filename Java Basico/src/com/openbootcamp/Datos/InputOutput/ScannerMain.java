package com.openbootcamp.Datos.InputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos números: ");
            scanner.reset();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Enteros son: " + a + " , " + b);
        }catch(InputMismatchException e){

        }
    }

}
