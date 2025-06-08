package Stacks_Queus;
import java.util.Arrays;
import java.util.Stack;
public class NGE1 {

    public static int[] nextGreaterElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
         int a[]={1,2,3,4,5};
        int b[]=nextGreaterElement(a,a.length);
        System.out.println(Arrays.toString(b));
    }

}
