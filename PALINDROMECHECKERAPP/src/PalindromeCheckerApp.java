import java.util.*;

public class PalindromeCheckerApp {

    public static boolean stackMethod(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s", "");
        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeMethod(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }


    public static boolean twoPointerMethod(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s", "");
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
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

        long start, end;


        start = System.nanoTime();
        boolean stackResult = stackMethod(input);
        end = System.nanoTime();
        long stackTime = end - start;


        start = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        end = System.nanoTime();
        long dequeTime = end - start;


        start = System.nanoTime();
        boolean twoPointerResult = twoPointerMethod(input);
        end = System.nanoTime();
        long twoPointerTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        sc.close();
    }
}