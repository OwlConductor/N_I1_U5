package p3;

public class P3_main {
    public static void main(String[] args) {
        double[][] array = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // a
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j]+1) + " ");
            }
            System.out.println();
        }

        // b
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        // c
        int indexI, indexJ;
        double[][] output = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                indexI = j;
                indexJ = array[i].length -i -1;

                output[indexI][indexJ] = (int) array[i][j];
            }
        }
        array = output;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((int)array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
