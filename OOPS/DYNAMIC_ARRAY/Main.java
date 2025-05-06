package DYNAMIC_ARRAY;

public class Main {
    public static void main(String[] args) {
       DynamicArray Array=new DynamicArray();
       Array.add(10);
       Array.add(20);
       Array.add(30);
       System.out.println(Array.size());
       System.out.println(Array.get(0));

       Array.print();
       System.out.println();
       Array.set(1, 100);
       Array.print();
       Array.remove();
     try {
        Array.get(-1);
     } catch (Exception e) {
        System.out.println("haaaaaaaaaa..");
     }

    }

}
