package OOPS2.INHERTANCE;

abstract class abstractclass {
    public abstract void getname();
    public void setname(){
        System.out.println("name");
    }

}
 class  Age extends abstractclass {
 @Override
public void getname(){
    System.out.println("nnama");
}
}

public class Abstraction {
    public static void main(String[] args) {
        abstractclass o;
        o=new Age();
        o.getname();

    }
}
