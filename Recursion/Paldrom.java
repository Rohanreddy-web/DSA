public class Paldrom {
    public static boolean checkpal(String s, int left,int right){
        if (left>=right) {
            return true;
        }
        boolean ans=checkpal(s, left+1, right-1);
        if (s.charAt(right)!=s.charAt(left)) {
            return false;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="madam";
       int left=0;
       int right=s.length()-1;
       System.out.println(checkpal(s, left, right));
    }
}
