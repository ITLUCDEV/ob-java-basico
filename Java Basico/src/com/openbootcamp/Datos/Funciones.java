package com.openbootcamp.Datos;

public class Funciones
{
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Lucho");
        holaMundo("Lucho", "Dev");
        holaMundo(3);

        String hola = devolverHola();
        System.out.println(devolverHola());


    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
    }

    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static void holaMundo(String name, String surname){
        System.out.println("Hola " + name + "" + surname);
    }

    private static void holaMundo(int num1){
        System.out.println("Hola " +
                "" + num1);
    }

    private static String devolverHola(){
        return "Devolver texto";
    }

    private static int suma(int num1, int num2){
        return num1 + num2;
    }
}
