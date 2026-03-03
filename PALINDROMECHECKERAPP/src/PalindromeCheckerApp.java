import java.util.*;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();            // convert to lowercase
        str = str.replaceAll("\\s", "");    // remove spaces using regex

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}




