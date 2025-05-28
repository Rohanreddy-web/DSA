package Stacks_Queus;
import java.util.Stack;
public class Minbacketrev {
	public static int countBracketReversals(String input) {
		//Your code goes here
		Stack<Character> stack = new Stack<>();
		  if (input.length() % 2 != 0) {
            return -1;
        }
		 for (int i = 0; i < input.length(); i++){
			   char ch = input.charAt(i);
            if (ch == '{') {
                stack.push(ch);
            }
			else if (!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
                  stack.pop();
           }
		   //special case starting
		   	else if(ch=='}'){
				stack.push(ch);
			}
		 }
		int count=0;
		while(!stack.isEmpty()){
			 char p1=stack.pop();
			 char p2=stack.peek();
			 if(p1==p2){
				 count+=1;
			 }
			 else{
				 count+=2;
			 }
		 }
		 return count;
	}

    public static void main(String[] args) {
        int ch=countBracketReversals("{{{{}}");
        int ch2=countBracketReversals("}}}{{{");
        System.out.println(ch);
        System.out.println(ch2);
    }
}
