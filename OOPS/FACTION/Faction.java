package FACTION;

public class Faction {
    private  int num;
    private  int den;
    public Faction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }

    public void print(Faction refrencrf2){
    System.out.println(this.num+"/"+this.den);
    System.out.println(refrencrf2.num+"/"+refrencrf2.den);
    }

    private void simplify(){
        int gcd=1;
        int smallvalue=Math.min(this.num,this.den);
        for (int i = 2; i <=smallvalue; i++) {
            if (this.num%i==0&& this.den%i==0) {
                gcd=i;
            }
        }
        this.num=this.num/gcd;
        this.den=this.den/gcd;

    }

    public void increment(){
    this.num=this.num+this.den;
    simplify();
    System.out.println(this.num+"/"+this.den);
    }
    public  void add(Faction refrencef2){//this refers to f2 object
        this.num=this.num*refrencef2.den+this.den*refrencef2.num;
        this.den=this.den*refrencef2.den;
        simplify();
        System.out.println(this.num+"/"+this.den);
    }
    //static method of adding
    public static Faction addststatic(Faction refrencef1,Faction refrencef2){
        int newnum = refrencef1.num * refrencef2.den + refrencef1.den * refrencef2.num;
        int newden = refrencef1.den * refrencef2.den;
        Faction f3=new Faction(newnum, newden);
        // System.out.println(f3.num+"/"+f3.den);
        return f3;
    }
    }
    

