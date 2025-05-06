public class Numbdig {
    public static int count(int n){
        if (n==0) {
            return 0;
        }
        int sumof=count(n/10);
        int numbdig=1+sumof;
        return numbdig;
    }
public static void main(String[] args) {
System.err.println(count(121));
}
}
