package OOPS2.INHERTANCE;

public class Car extends Vehicle {
    String s="h";
    public void print(){
        super.maxSpped1();
        System.out.println(name);
    }
    public void name(String name){
        System.out.println(name.trim());
       }
}
