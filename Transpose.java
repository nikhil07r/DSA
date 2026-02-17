public class Transpose {

    static void show(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }g
    public static void main(String[] args) {

        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] t = new int[3][3];

        show(x);
        System.out.println("Transpose:");

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x.length; j++)
                t[j][i] = x[i][j];

        show(t);
    }
}
