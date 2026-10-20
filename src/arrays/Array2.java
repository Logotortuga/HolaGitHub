package arrays;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ANCHO??");
        int n = in.nextInt();
        System.out.println("ALTO??");
        int m = in.nextInt();
        int bidi[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                bidi[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(bidi[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
