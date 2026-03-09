import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // rows
        int m = sc.nextInt();   // columns

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][] = new int[n][m];

        // Input first matrix
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        // Input second matrix
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                b[i][j] = sc.nextInt();

        // Multiply matrices
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                for(int k = 0; k < m; k++)
                    c[i][j] += a[i][k] * b[k][j];

        // Print result
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
