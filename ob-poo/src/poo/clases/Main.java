package poo.clases;

public class Main {

    public static void main(String[] args) {
        Motor MotorGTX = new Motor("GTX", 20, 22.5, 2);
        Vehiculo toyotaPrius = new Vehiculo("Toyota", "Prius", 45.4, 2000, false, MotorGTX);
        toyotaPrius.acelerar(20);

        System.out.println(toyotaPrius);
    }


}
