package Stacks_Queus;

public class StackArray {
    private int data[];
    private int topindex;
    int index = 0;

    public StackArray() {
        data = new int[10];
        topindex = -1;
    }

    public void push(int n) {
        if (index < data.length) {
            data[index] = n;
            index++;
            topindex++;
        } else {
            doubleArraySize();
        }

    }

    public void doubleArraySize() {
        int newarr[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newarr[i] = data[i];
        }
        data = newarr;// change refrence
    }

    public int pop() {
        if (index == 0) {
            return 0;
        }
        index--;
        int temp = data[index];
        data[topindex] = 0;
        topindex--;
        return temp;
    }

    public int size() {
        return index;
    }

    public int top() {
        if (topindex<0) {
            return topindex;
        }
        else{
            return data[topindex];
        }
    }

    public boolean isEmpty() {
        if (index != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i <= topindex; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
