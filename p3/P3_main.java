package p3;

public class P3_main {
    public static void main(String[] args) {
        double[][] array = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // a
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((int)(array[i][j]+1) + " ");
            }
            System.out.println();
        }*/

        // b
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        //System.out.println("Sum: " + sum);

        // c
         array = new double[][]{
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {6.0, 7.0, 8.0, 9.0, 10.0},
            {11.0, 12.0, 13.0, 14.0, 15.0},
            {16.0, 17.0, 18.0, 19.0, 20.0},
            {21.0, 22.0, 23.0, 24.0, 25.0}
        };
        double bufferValue;

        // Matrix LAYER
        for (int l = 0; l <= array.length/2; l++) {
            //System.out.println("Layer    : " + l + " to " + ((array.length - l)/2));

            // Matrix ROTATIONS of layer
            for (int r = l; r<= array.length-2 -l; r++) {

                //CENTRAL element continue
                //if (l == ((array.length)/2) && (array.length % 2 != 0)) continue;

                bufferValue = array[l][r];

                // top
                //System.out.println("Top    : " + l + " " + r); 
                array[l][r] = array[((array.length - r)-1)][l];

                // left
                //System.out.println("Left   : " + ((array.length - r)-1) + " " + l);
                array[((array.length - r)-1)][l] = array[((array.length - l)-1)][((array.length - r)-1)];

                // bottom
                //System.out.println("Bottom : " + ((array.length - l)-1) + " " + ((array.length - r)-1));
                array[((array.length - l)-1)][((array.length - r)-1)] = array[r][((array.length - l)-1)];
                
                // right
                //System.out.println("Right  : " + r + " " + ((array.length - l)-1));
                array[r][((array.length - l)-1)] = bufferValue;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((int)array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
