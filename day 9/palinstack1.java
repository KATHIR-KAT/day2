import java.util.*;

class palinstack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

 
        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }

        System.out.println("Reversed String: " + rev);

        
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}