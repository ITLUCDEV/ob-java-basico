package com.openbootcamp;

public class CocheMain {

    public static void main(String[] args) {

        Coche coche = new CocheElectrico();

        Coche coche2 = new CocheElectrico("coche", "honda", "civic", 1430.45, 5.4, "TRX");

        coche2.acelerar(70);
        System.out.println(coche2);

        coche2.peso = 12350.8;
        System.out.println(coche2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Ejemplo color";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";


        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.motorHibrido = "Ejemplo motor hibrido";
        cocheHibrido.fabricante = "Audi";

        System.out.println(cocheHibrido);

        System.out.println(cocheElectrico);



        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.99d, "TXZ");
        cocheElectrico2.acelerar(60);
        System.out.println(cocheElectrico2);



    }

}
