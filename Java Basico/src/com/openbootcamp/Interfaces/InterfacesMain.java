package com.openbootcamp.Interfaces;
import com.openbootcamp.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service.crearCocheDemo();

        Coche coche2 = service2.crearCocheDemo();

    }

}
