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
        double buffer = 0;
        int indexOffsetI = 1;
        int indexOffsetJ = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                indexOffsetI = array.length -i -1;
                indexOffsetJ = array[i].length -j -1;

                buffer = array[indexOffsetI][j];
                //array[i][j] = array[j][i];
                //array[j][i] = buffer;

                System.out.print(buffer + " ");
            }
            System.out.println();
        }
    }
}
