package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};

        int bufferValue;
        int indexOffsetI;
        for (int i = 0; i < myArray.length / 2; i++) {
            indexOffsetI = myArray.length - 1 - i;
            bufferValue = myArray[i];
            myArray[i] = myArray[indexOffsetI];
            myArray[indexOffsetI] = bufferValue;
        }

        //for (int value : myArray) System.out.print(value + " ");
    }
}
