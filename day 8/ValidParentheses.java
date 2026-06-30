import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {

                if (s.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '[' && ch == ']') ||
                    (s.peek() == '{' && ch == '}')) {

                    s.pop();
                } else {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (s.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}