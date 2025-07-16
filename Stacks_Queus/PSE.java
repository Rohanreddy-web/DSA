package Stacks_Queus;
import java.util.ArrayList;
import java.util.Stack;
public class PSE {
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
            // stack.push(arr[i]);
             stack.push(i);
        }
        return ans;
    }
    public static int[]nextsmallerelement(int[]arr,int n){
         Stack<Integer> stack =new Stack<>();
            int[] ans2 = new int[n];
        for (int i = n-1; i >=0; i--) {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
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
    public static void main(String[] args) {
         int a[]={3,1,2,4};
        int n=a.length;
        int ans1[]=privsmallerelement(a, n);
         int ans2[]=nextsmallerelement(a, n);
         System.out.println("priv");
        for (int i : ans1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : ans2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
