package ReverseString;

public class Main {

    public static void main(String[] args) {

        String text = "Hola mundo";

        // Utilizamos getBytes() para convertir la String a bytes[]
        byte[] textByte = text.getBytes();
        byte[] resultado = new byte[textByte.length];

        // Imprimimos el resultado dándole orden inverso
        for(int i = 0; i < textByte.length; i++){
            resultado[i] = textByte[textByte.length - i - 1];
        }
        System.out.println(new String (resultado));

    }

}
