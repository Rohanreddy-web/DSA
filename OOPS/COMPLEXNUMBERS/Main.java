package COMPLEXNUMBERS;

public class Main {
    public static void main(String[] args) {
        ComplexNumbers c1=new ComplexNumbers(4, 5);
        ComplexNumbers c2=new ComplexNumbers(1, 2);
        c1.print();
        c2.print();
        // c1.add(c2);
        // c1.multiply(c2);
        ComplexNumbers c3=ComplexNumbers.multiplystatic(c1, c2);
        c3.print();
    }
}
