import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the text: ");
                String text = input.nextLine();
                text = text.toLowerCase(Locale.ROOT);
                boolean flag = true;
                Stack<Character> stack = new Stack<>();
                for( char c: text.toCharArray()){
                    stack.push(c);
                }
                for(char c: text.toCharArray()){
                    if(!stack.pop().equals(c)){
                        flag = false;
                        break;
                    }
                }
                System.out.println((flag)?"It's a palindrome":"Not a palindrome");
            };

}

