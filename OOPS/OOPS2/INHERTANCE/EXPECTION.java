package OOPS2.INHERTANCE;

public class EXPECTION {
    public static  void divid(int a, int b) throws ArithmeticException{
       //we can handle this by try-catch block 
        if (b==0) {
            throw new ArithmeticException("THIS IS /0 EXPECTION");
        }
        else{
            System.out.println(a/b);
        }
    }
   public static int fact(int n) throws RohanExpection{
    if (n<0) {
        throw new FACTEXPECTION("This is a costum expection");

    }
     if (n==0) {
        return 1;
     }
     int sumallsum=n*fact(n-1);
     return sumallsum;
   }
    
    public static void main(String[] args) {
      try {
        divid(10, 0);
      } catch (Exception e) {
        // e.printStackTrace();
      }
      try {
        System.out.println(fact(-5));
      } catch (Exception e) {
        System.out.println(e.getMessage());
        // e.printStackTrace();
      }
      
    }
}
