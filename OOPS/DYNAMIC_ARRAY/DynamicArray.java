package DYNAMIC_ARRAY;

public class DynamicArray {
    private int data[];
    private int nextIndexelement;

    public DynamicArray() {
        data = new int[5];
        nextIndexelement=0;
    }

    public int size() {
        return nextIndexelement;
    }

    public int get(int i) throws ArrayIndexOutOfBoundsException {
        if (i >= nextIndexelement){
          throw new ArrayIndexOutOfBoundsException();
        }
        return data[i];
    }

    public boolean isEmpty() {
        boolean flage = nextIndexelement == 0;
        return flage;
    }
//This is the Main Add logic
    public void add(int n) {
        if (nextIndexelement==data.length) {
            doublesizeArray();
        }
     data[nextIndexelement]=n;
     nextIndexelement++;
    }

    private void doublesizeArray() {
       int newdata[]=new int[data.length*2];
       for (int i = 0; i < data.length; i++) {
        newdata[i]=data[i];
       }
       data=newdata;//referencr of orginal Array to new Array referencr
    }

    public void remove() {
        if (size()==0) {
            return;
        }
     nextIndexelement--;
     data[nextIndexelement]=0;
     System.out.println();
     print();
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < nextIndexelement; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("]");
    }

    public void set(int i, int element) {
        if (i>=nextIndexelement) {
            return;
        }
      data[i]=element;
    }

}
