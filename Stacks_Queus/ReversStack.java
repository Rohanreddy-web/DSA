package Stacks_Queus;
import java.util.Stack;
public class ReversStack {
    public static void reverseStack(Stack<Integer> stack1) {
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack3.push(stack2.pop());
        }
        while (!stack3.isEmpty()) {
            stack1.push(stack3.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        System.out.println("Original Stack: " + stack1);

        reverseStack(stack1);

        System.out.println("Reversed Stack: " + stack1);
    }
}

