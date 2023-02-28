package poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        Empleado Juan = new Empleado("Juan", 30, 40000, true);
        Empleado Patricia = new Empleado("Patricia", 35, 24584.99, true);
        Empleado Roberto = new Empleado("Roberto", 28, 25000.12, true);

        // guardar empleados
        empleadoCRUD.save(Juan);
        empleadoCRUD.save(Patricia);
        empleadoCRUD.save(Roberto);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }

}
