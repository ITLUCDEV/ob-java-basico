package com.openbootcamp.Datos;

public class WhileLoop {

    public static void main(String[] args) {

        boolean check = true;
        int count = 0;

        while(count <= 10){
            count++;
            if(count == 6){
                continue;
            }else if(count > 6){
                break;
            }
            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");

    }

}
