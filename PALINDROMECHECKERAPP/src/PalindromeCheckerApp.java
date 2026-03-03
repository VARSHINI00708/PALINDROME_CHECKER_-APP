import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheckerApp {


    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        text = text.toLowerCase(Locale.ROOT);
        Boolean flag = true;
        for(int i = 0; i<text.length()/2; i++ ){
            if(text.charAt(i) != text.charAt(text.length()-i-1)){
                flag = false;
                break;
            }
        } System.out.println("Is it a palindrome? "+flag);
    }
}
