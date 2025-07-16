package Stacks_Queus;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
public class Sumofsubarraymin {
    public static int[] privsmallerelement(int[]arr,int n){
        Stack<Integer> stack =new Stack<>();
            int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[]nextsmallerelement(int[]arr,int n){
         Stack<Integer> stack =new Stack<>();
            int[] ans2 = new int[n];
        for (int i = n-1; i >=0; i--) {
            while(!stack.isEmpty()&&arr[stack.peek()]>arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans2[i]=-1;
            }
            else{
                ans2[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans2;
    }
   public static int sumSubarrayMins(int[] arr) {
    int n = arr.length;
    long sum = 0;
    int mod = (int) Math.pow(10, 9) + 7;
    int[] prev = privsmallerelement(arr, n);
    int[] next = nextsmallerelement(arr, n);
    System.out.println(Arrays.toString(prev));
    System.out.println(Arrays.toString(next));

    for (int i = 0; i < n; i++) {
        long left=0;
        long right=0;

        if (prev[i] == -1) {//edge cases
            left = i + 1;
        } else {
            left = i - prev[i];
        }

        if (next[i] == -1) {//edge cases
            right = n - i;
        } else {
            right = next[i] - i;
        }

        long contrib = (arr[i] * left % mod) * right % mod;
        sum = (sum + contrib) % mod;
    }

    return (int) sum;
}
public static void main(String[] args) {
    int[]arr={1,2,3};
    System.out.println(sumSubarrayMins(arr));
    
}
}
