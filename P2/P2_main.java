package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] numbers = {1,2,10,4,5,6,7,8,9,10};
        int max = 0;
        int minIndex = 0;

        for (int index = 0; index<numbers.length; index++) {
            if (numbers[index] > max) {
                max = numbers[index];
                minIndex = index;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Index of max value: " + minIndex);
    }
}
