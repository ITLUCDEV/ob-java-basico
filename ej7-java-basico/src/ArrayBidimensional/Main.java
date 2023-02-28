package ArrayBidimensional;

public class Main {

    public static void main(String[] args) {
        int[][] arrayBidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("El elemento en la posición [" + i + "][" + j + "] es " + arrayBidimensional[i][j]);
            }
        }

    }

}