package poo.clases;

    public class Vehiculo {

        // atributos

        String fabricante;
        String modelo;
        double cc;
        int year;
        boolean sport;
        int speed;
        Motor motor;

        // constructores

        public Vehiculo(){

        }

        public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, Motor motor) {
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.cc = cc;
            this.year = year;
            this.sport = sport;
            this.motor = motor;
        }

        public Vehiculo(String fabricante, String modelo){
            this.fabricante = fabricante;
            this.modelo = modelo;
        }



        // métodos

        public void acelerar(int cantidad){
            this.speed += cantidad;
        }

        @Override
        public String toString() {
            return "Vehiculo{" +
                    "fabricante='" + fabricante + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", cc=" + cc +
                    ", year=" + year +
                    ", sport=" + sport +
                    ", speed=" + speed +
                    ", motor=" + motor +
                    '}';
        }
    }

