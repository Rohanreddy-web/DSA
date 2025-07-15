public class TowerofHanou {
    public static void towerofhanou(int n, String src,String help,String dest){
        if (n==0) {
            System.out.println(n+" "+"plate"+" "+ src+"--->"+dest);
            return;
        }
        towerofhanou(n-1, src, dest, help);

        System.out.println(n+" "+"plate"+" "+ src+"--->"+dest);

        towerofhanou(n-1, help, src, dest);


    }
    public static void main(String[] args) {
        towerofhanou(3, "S", "H", "D");
       
    }
}
