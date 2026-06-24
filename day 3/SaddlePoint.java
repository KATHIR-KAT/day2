import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < 3; i++) {

            int minCol = 0;

            
            for (int j = 1; j < 3; j++) {
                if (arr[i][j] < arr[i][minCol]) {
                    minCol = j;
                }
            }

            
            boolean saddle = true;

            for (int k = 0; k < 3; k++) {
                if (arr[k][minCol] > arr[i][minCol]) {
                    saddle = false;
                    break;
                }
            }

            if (saddle) {
                System.out.println("Saddle Point = " + arr[i][minCol]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }

        sc.close();
    }
}