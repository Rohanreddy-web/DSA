package Stacks_Queus;
import java.util.Stack;
public class NGE2 {
 static int n1=1;
    public static int[] nextGreaterElement(int[] arr, int n) {
        n1=2;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for (int i = 2*n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i%arr.length]) {
                stack.pop();
            }
            if(i<=arr.length-1){
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
        }

            stack.push(arr[i%arr.length]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,10,12,1,11};
        int n=a.length;
        int ans[]=nextGreaterElement(a, n);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(n1);
    }
}
