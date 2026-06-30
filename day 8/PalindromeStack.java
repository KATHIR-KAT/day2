import java.util.*;

public class PalindromeStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str=str.toLowerCase();

        Stack<Character> s = new Stack<>();

       
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        boolean palindrome = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != s.pop()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}