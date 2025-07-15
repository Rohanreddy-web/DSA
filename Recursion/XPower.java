public class XPower {
public static int pow(int x,int n){
    if (n==0) {
        return 1;
    }
    int Xpow=pow(x, n-1);
    int ans=x*Xpow;
    return ans;
}
public static void main(String[] args) {
 int X=2,n=3;
 System.out.println(pow(X, n));
}
}
//3->2->1->0

