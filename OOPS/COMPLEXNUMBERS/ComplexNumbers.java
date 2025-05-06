package COMPLEXNUMBERS;

public class ComplexNumbers {
    private int real;
    private int imag;
    public ComplexNumbers(int real,int imag){
      this.real=real;
      this.imag=imag;
    }
    public void print(){
        System.out.println(this.imag>0?this.real+"+"+"i"+this.imag:real + " - " + (-imag) + "i");
    }
    public void add(ComplexNumbers refereencec2){
        this.real=this.real+refereencec2.real;
        this.imag=this.imag+refereencec2.imag;
        print();
    }
    public void multiply(ComplexNumbers referencec2) {
        int oreal = this.real;
        int oImag = this.imag;
        int newreal = (oreal* referencec2.real) - (oImag * referencec2.imag);
        int newimg = (oreal * referencec2.imag) + ( oImag* referencec2.real);
        this.real = newreal;
        this.imag = newimg;
        print();
    }
    public static ComplexNumbers multiplystatic(ComplexNumbers r1,ComplexNumbers r2){
        int newReal = (r1.real * r2.real) - (r1.imag * r2.imag);
        int newImag = (r1.real * r2.imag) + (r1.imag * r2.real);
        ComplexNumbers c3=new ComplexNumbers(newReal, newImag);
        return c3;
    }
}
