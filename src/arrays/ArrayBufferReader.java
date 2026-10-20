package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ArrayBufferReader {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("ANCHO??");
            int n = Integer.parseInt(in.readLine());
            System.out.println("ALTO??");
            int m = Integer.parseInt(in.readLine());
            String bidi[][] = new String[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    bidi[i][j] = in.readLine();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(bidi[i][j] + " ");
                }
                System.out.println("");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
