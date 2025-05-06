package Stacks_Queus;
import java.util.Stack;

public class Infixtopostfix {
    public static int pri(char i) {
        switch (i) {
            case '^':
                return 3; 
            case '*':
            case '/':
                return 2; 
            case '+':
            case '-':
                return 1; 
            default:
                return -1;
        }
    }

    public static String postfix(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Operand (A-Z, a-z)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                ans += ch;
            }
            // Left Parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }
            // Right Parenthesis
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char c=stack.peek();
                    ans += c;
                    stack.pop();
                }
                stack.pop(); // pop '('
            }
            // Operator
            else {
                 //it checks every top() 
                while (!stack.isEmpty() && pri(ch) <= pri(stack.peek())) {
                    ans += stack.peek();
                    stack.pop();
                }
                stack.push(ch); // push the current operator
            }
        }

        // Pop remaining operators from the stack
        while (!stack.isEmpty()) {
            char c=stack.peek();
            ans += c;
            stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(postfix("a+b*(c^b-e)"));
    }
}
