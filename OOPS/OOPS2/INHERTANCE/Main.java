package OOPS2.INHERTANCE;
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
a.makeSound();   // ✅ OK — makeSound is in Animal
// a.bark();        // ❌ Compile-time error — bark is not in Animal

    }
}
