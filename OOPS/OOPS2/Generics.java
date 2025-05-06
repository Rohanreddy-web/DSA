package OOPS2;

public class Generics <T,S> {
    T par1;
    S par2;
    public Generics(T par1, S par2){
        this.par1=par1;
        this.par2=par2;
    }
    public T getpar1(){
        return this.par1;
    }
    public S getpar2(){
        return this.par2;
    }
    //  public int add(){
    //     return this.par1.intValue()+this.par2.intValue();
    // }
}
