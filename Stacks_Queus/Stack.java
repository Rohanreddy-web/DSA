package Stacks_Queus;
public class Stack {
    public static void main(String[] args) {
        StackArray stack=new StackArray();
         stack.push(6);
         stack.push(5);
         stack.push(4);
         stack.push(3);
         stack.print();
          stack.pop();
         stack.print();
         System.out.println(stack.top());
         System.out.println(stack.isEmpty());
         System.out.println(stack.size());
         //by Linked list
         StackLL<Integer> S=new StackLL<Integer>();
         S.push(20);
         S.push(30);
         S.push(40);
         S.push(50);
         System.out.println(S.pop());
         System.out.println(S.top());
         System.out.println(S.isEmpty());
        //  while (! S.isEmpty()) {
        //     System.out.println(S.pop());
        //  }
    }
}
