import java.util.*;

class palinstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int pushed[] = new int[n];
        int popped[] = new int[n];

        System.out.println("Enter the pushed sequence:");
        for (int i = 0; i < n; i++) {
            pushed[i] = sc.nextInt();
        }

        System.out.println("Enter the popped sequence:");
        for (int i = 0; i < n; i++) {
            popped[i] = sc.nextInt();
        }

        Stack<Integer> s = new Stack<>();
        int index = 0;

        for (int i = 0; i < n; i++) {
            s.push(pushed[i]);

            while (!s.isEmpty() && index < n && s.peek() == popped[index]) {
                s.pop();
                index++;
            }
        }

        if (s.isEmpty()) {
            System.out.println("Valid Stack Sequence");
        } else {
            System.out.println("Invalid Stack Sequence");
        }

        sc.close();
    }
}