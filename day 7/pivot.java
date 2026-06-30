import java.util.*;

public class pivot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;


        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Pivot Index = " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Pivot Index");
    }
}