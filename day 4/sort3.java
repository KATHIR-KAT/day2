import java.util.*;

class sort3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Elements in array: ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for(int i = 0; i < num; i++) {
            if(arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while(index < num) {
            arr[index++] = 0;
        }

        System.out.println("Array after moving zeros:");

        for(int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}