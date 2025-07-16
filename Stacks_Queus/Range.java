package Stacks_Queus;
import java.util.Stack; 
import java.util.Arrays; 
class Range {

    public static int[] privsmallerelement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static int[] nextsmallerelement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            ans2[i] = stack.isEmpty() ? -1 : stack.peek();
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
        System.out.println("Prev Smaller: " + Arrays.toString(prev));
        System.out.println("Next Smaller: " + Arrays.toString(next));

        for (int i = 0; i < n; i++) {
            long left = (prev[i] == -1) ? (i + 1) : (i - prev[i]);
            long right = (next[i] == -1) ? (n - i) : (next[i] - i);
            long contrib = (arr[i] * left % mod) * right % mod;
            sum = (sum + contrib) % mod;
        }

        return (int) sum;
    }

    public static int[] privgreaterelement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static int[] nextgreaterelement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            ans2[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans2;
    }

    public static int sumSubarrayMaxs(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int mod = (int) Math.pow(10, 9) + 7;
        int[] prev = privgreaterelement(arr, n);
        int[] next = nextgreaterelement(arr, n);
        System.out.println("Prev Greater: " + Arrays.toString(prev));
        System.out.println("Next Greater: " + Arrays.toString(next));

        for (int i = 0; i < n; i++) {
            long left = (prev[i] == -1) ? (i + 1) : (i - prev[i]);
            long right = (next[i] == -1) ? (n - i) : (next[i] - i);
            long contrib = (arr[i] * left % mod) * right % mod;
            sum = (sum + contrib) % mod;
        }

        return (int) sum;
    }

    public long subArrayRanges(int[] nums) {
        long maxSum = sumSubarrayMaxs(nums);
        long minSum = sumSubarrayMins(nums);
        return maxSum - minSum;
    }

    // ✅ Add main method to test:
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3};
        long result = sol.subArrayRanges(arr);
        System.out.println("Subarray Range Sum: " + result);
    }
}
