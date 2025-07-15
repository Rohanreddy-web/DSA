package Stacks_Queus;
import java.util.Stack;
public class PSE {
    public static int[] privsmallerelement(int[]arr,int n){
        Stack<Integer> stack =new Stack<>();
            int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty()&&stack.peek()>=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
    public static int[]nextsmallerelement(int[]arr,int n){
         Stack<Integer> stack =new Stack<>();
            int[] ans2 = new int[n];
        for (int i = n-1; i >=0; i--) {
            while(!stack.isEmpty()&&stack.peek()>=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans2[i]=-1;
            }
            else{
                ans2[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans2;
    }
    public static void main(String[] args) {
         int a[]={4,10,5,8,20,15,3,12};
        int n=a.length;
        // int ans[]=privsmallerelement(a, n);
         int ans[]=nextsmallerelement(a, n);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
