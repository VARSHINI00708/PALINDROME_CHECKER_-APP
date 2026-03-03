import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        text = text.toLowerCase(Locale.ROOT);
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for( char c: text.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        for ( int i=0; i<text.length(); i++ ){
            if(!stack.pop().equals(queue.remove())){
                flag = false;
                break;
            }
        }
        System.out.println((flag)?"It's a palindrome":"Not a palindrome");
    }

}

