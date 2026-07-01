import java.util.*;

class trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                s.append(ch);
            }
        }

        System.out.println("After removing non-letter characters:");
        System.out.println(s);

        sc.close();
    }
}