package src;

import java.util.Scanner;

public class info {
    private int age;
    private String name;
    public final int id;
    public static int NUMBER_OF_STUDENTS;//static variable—it belongs to the whole class, not just one object.
    //constructor with arguments
    public info(String name,int id){
        this.name=name;
        this.id=id;
        NUMBER_OF_STUDENTS++;

    }
    public info(){
    //calling the without arguments
    this("rohan reddy",60);
    System.out.println("after excuting first const");

    }
    public static int GET_NUMBER_OF_STUDENTS(){//static method 
        return NUMBER_OF_STUDENTS;
    }
    //GET
    public String getage(int a){
        return this.age+" "+this.name+" "+a;
    }
    //SET
    public void setage(int age){
        if (age<=0) {
            return;
        }
        this.age=age;
        // System.out.println(this+" "+"thisKeyword");
    }
}
