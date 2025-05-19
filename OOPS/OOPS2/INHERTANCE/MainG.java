package OOPS2.INHERTANCE;

import OOPS2.Generics;

public class MainG {
    public static void main(String[] args) {
        Generics <Integer,String>g0=new Generics<Integer,String>(10,"sai");
        Generics <Double,Integer> g3=new Generics<>(1.20,1);
        Generics <Generics<Integer,String>,Generics<Double,Integer>>g1=new Generics<>(g0,g3);
        //int waper calss which raps primative datatype becouse <> allow only non primative typs{objects}
        // Generics <Integer,String>g1=new Generics<Integer,String>(10, "ROHAN REDDY");
        System.out.println(g1.getpar1());
        System.out.println(g1.getpar1().getpar1());
        System.out.println(g1.getpar1().getpar2());
        System.out.println(g1.getpar2());
        System.out.println(g1.getpar2().getpar1());
        System.out.println(g1.getpar2().getpar2());

        // System.out.println(g1.getpar2());
        // Generics <String>g2=new Generics<String>("rohan", "reddy");
        // System.out.println(g2.getpar1());
        // System.out.println(g2.getpar2());
        
    }
}
