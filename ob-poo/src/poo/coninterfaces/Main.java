package poo.coninterfaces;

import poo.sininterfaces.Empleado;

public class Main {

    static EmpleadosCRUD empleadosCRUD;
    public static void main(String[] args) {

        empleadosCRUD.findAll();
        empleadosCRUD.save(new Empleado());

    }

}
