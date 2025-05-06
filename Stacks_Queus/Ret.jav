import java.util.Scanner;
import java.util.Stack;

public class Ret {

    public static boolean checkRedundantBrackets(String expression) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                if (count == 0 || count == 1) {
                    return true;
                }
                //reset to check next pairs
                else {
                    count = 0;
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = scanner.nextLine();

        boolean hasRedundant = checkRedundantBrackets(input);
        if (hasRedundant) {
            System.out.println("Redundant brackets found.");
        } else {
            System.out.println("No redundant brackets.");
        }

        scanner.close();
    }
}
