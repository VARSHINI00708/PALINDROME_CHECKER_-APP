import java.util.*;

public class PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s", "");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}



