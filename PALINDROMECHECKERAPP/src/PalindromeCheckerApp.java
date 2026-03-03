import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        text = text.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        for(int i = text.length()-1; i>=0; i--){
            sb.append(text.charAt(i));
        }
        if ( text.equals(sb.toString())) System.out.println("It is a palindrome");
        else System.out.println("Not a palindrome");
}
}
