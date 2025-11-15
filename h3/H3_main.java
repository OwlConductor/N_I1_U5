package h3;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[][]{{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int input = 12345343;

        int bufferInput = input;
        for (int i = 0; i<einheiten[0].length ; i++) {
            einheiten[1][i] = bufferInput / einheiten[0][i];
            bufferInput -= einheiten[1][i] * einheiten[0][i];
            if (bufferInput == 0)
                break;
        }
        
        //System.out.println("Betrag: " + input);
        //for (int i = 0; i < einheiten[0].length; i++)
        //System.out.println(einheiten[1][i] + " " + einheiten[0][i]);
        //int summe = 0;
        //for (int i = 0; i < einheiten[0].length; i++)
        //summe += einheiten[0][i] * einheiten[1][i];
        //System.out.println("Summe: " + summe);
    }
}
