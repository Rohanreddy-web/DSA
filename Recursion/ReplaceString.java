public class ReplaceString {
public static String replace(String s,char a,char b){
    if(s.length()==0){
        return "";
    }
    String smalloutput=replace(s.substring(1), a, b);
    if (s.charAt(0)==a) {
        return b+smalloutput;
    }
    return s.charAt(0)+smalloutput;
}
//removing duplicates
public static String duplicates(String s){
    if (s.length()<=1) {
        return s;
    }
    String small=duplicates(s.substring(1));
    if (s.charAt(0)==s.charAt(1)) {
        return small;
    }
    else{
        return s.charAt(0)+small;
    }
}
//compire strings
public static boolean isthare(String s1,String s2){
    if (s2.length()==0) {
        return true;
    }
    boolean result=isthare(s1, s2.substring(1));
    char ch=s2.charAt(0);
    if (s1.indexOf(ch)==-1) {
       return false;
    }
    return result;
   
}
// string to integer
	public static int convert(String input){
		if(input.length()==0){
			return 0;
		}
		int a=convert(input.substring(1));
		int b=input.charAt(0) - '0';
		int ans=b * (int)Math.pow(10, input.length() - 1) +a;//formula b*10^n-1+a()
		return ans;
	}
    // public static void integer(String s){
    //     int i=0;
    //     int ans=0;
    //   while (i<=s.length()-1) {
    //     int b=s.charAt(i)-'0';
    //     ans += b * (int) Math.pow(10, s.length() - 1 - i);
    //     i++;
    //   }
    //   System.out.println(ans);
    // }


public static void main(String[] args) {
System.out.println(replace("abcxdxgx", 'x','y'));
System.out.println(duplicates("mmaamamd"));
String s1 = "abchjsgsuohhdhyrikkknddg";
String s2= "coding";
System.out.println(isthare(s1, s2));
String d="123";
d.substring(1);
System.out.println(convert("1234"));
// System.out.println((int)((1*Math.pow(10, 3)))+231);
// integer("1234");

}
}
