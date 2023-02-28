package poo.clases;

public class Motor {

    // atributos

    String modelo;
    int caballos;
    double parNm;
    int numCilindros;

    // constructor

    public Motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }


    // metodos


    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", caballos=" + caballos +
                ", parNm=" + parNm +
                ", numCilindros=" + numCilindros +
                '}';
    }
}
