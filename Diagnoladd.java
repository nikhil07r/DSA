// wap to print the sum of diagonal elements of a matrix
import java.util.Scanner;
public class Diagnoladd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] a = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
                if (j > i) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println(sum);
        s.close();
    }
}


