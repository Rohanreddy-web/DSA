public class Febnanacci {
    //factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int ans=factorial(n - 1);

        return n*ans;
    }
//Febnanch series
    public static void feban(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int x = a;
        int y = b;
        int c = x + y;
        System.out.print(c + " ");
        feban(y, c, n - 1);
    }
    // public static void feb(){
    // int a=0;
    // int b=1;
    // int n=6;
    // while (n!=0) {
    // int c=a+b;
    // System.out.print(c);
    // a=b;
    // b=c;
    // n--;
    // }
    // }

    // Finding N feb in natural numbers
    public static int findfeb(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int feb1 = findfeb(n - 1);
        int feb2 = findfeb(n - 2);
        return feb1 + feb2;
    }

    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int n = 8;
        feban(a, b, n - 2);
        System.err.println();
        int ans = findfeb(5);
        System.out.println(ans);
        System.out.println(factorial(5));

    }
}
