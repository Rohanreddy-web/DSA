public class CountZeros {
public static int Count(int n){
    if (n==0) {
        return 0;
    }
    if (n%10==0) {
        int ans=Count(n/10);
        return 1+ans;
    }
    int small=Count(n/10);
    return 0+small;
}
//Gometric Sum
public static double gometricadd(int k){
    if(k==0){
        return 1;
    }
    double smallsum=gometricadd(k-1);
    return smallsum+1/Math.pow(2, k);
}
//Add Sum
public static int Addsum(int n){
    if (n==0) {
        return 0;
    }
    int smallsum=Addsum(n/10);
    return (n%10)+smallsum;
}

public static void main(String[] args) {
    System.out.println(Count(708000));
    System.out.println(gometricadd(3));
    System.out.println(Addsum(1234));
 
}
}
