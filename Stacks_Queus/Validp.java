package Stacks_Queus;

import java.util.Stack;

public class Validp {
    public static void main(String[] args) {
        String s = "(()()())";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            }
            else if ( !stack.isEmpty() && (stack.peek() == '[' && ch == ']' || stack.peek() == '(' && ch == ')'
                    || stack.peek() == '{' && ch == '}')) {
                        stack.pop();

            }
        }
        if (stack.isEmpty()) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        // System.out.println(stack.peek());
    }
}
