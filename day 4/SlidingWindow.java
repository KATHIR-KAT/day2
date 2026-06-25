import java.util.*;
import java.lang.*;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
                     System.out.print("Enter element:");
                     int num=sc.nextInt();
                      arr[i]=num;
                      }
        System.out.print("Enter the window size:");
        int k = sc.nextInt();

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
           
        }
        System.out.println(windowSum);
        int maxSum = windowSum;
        
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
            System.out.println(maxSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}

