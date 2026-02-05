import java.util.Scanner;

public class SubstractionOfMAtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{5,6,7},{5,6,7}};
        int brr[][]={{1,2,3},{5,6,7},{5,6,7}};
        int newarr[][]=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                newarr[i][j]=arr[i][j]-brr[i][j];

            }

        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();

        }


    }
}