package FACTION;

public class Main {
    public static void main(String[] args) {
        Faction f1=new Faction(20, 30);
        Faction f2=new Faction(3, 5);
        // f1.print(f2);
        // f1.increment();
        // f2.increment();
        // f1.add(f2);
        Faction f3=Faction.addststatic(f1, f2);
        f3.print(f2);

    }
}
