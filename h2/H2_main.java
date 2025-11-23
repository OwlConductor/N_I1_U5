package h2;

import java.lang.Math;

public class H2_main {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE/10;
        int digits = 0;
        int[] a = new int[]{0,0,0,0,0,0,0,0,0};

        // code
        digits = 0;
        double bufferN = n;
        while (Math.pow(10, digits)<=n) {
            a[a.length-1-digits] =(int)((bufferN % (Math.pow(10,digits+1)))/ (Math.pow(10,digits)));
            bufferN -= (int)(bufferN % (Math.pow(10,digits)));
            digits++;
        }
        // 0 can also seen as a digit
        if (n==0)
            digits = 1;

        // printouts
        //for (int i : a) System.out.print(i + " ");
        //System.out.println("Digits: " + digits);
    }
}
