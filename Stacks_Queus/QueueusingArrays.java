package Stacks_Queus;

public class QueueusingArrays {
    private int data[];
    private int front;
    private int rear;
    private int size;
    private int index;

    public QueueusingArrays() {
        data = new int[3];
        front = -1;
        rear = -1;
        size = 0;
        index = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    public int front() {
        return data[front];
    }

    public void enqueur(int element) {
        rear++;
        if (size==0) {
            front++;
        }
        if (index >= data.length) {
            doubleArraySize();
        }
        data[index] = element;
        size++;
        index++;
    }

    public int dequeue()throws ArrayIndexOutOfBoundsException{
        if (size==0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int temp = data[front];
        data[front]=0;
        front++;
        size--;
        if (size==0) {//edge case
            front=-1;
            rear=-1;
        }
        return temp;
    }

    public int rear() {
        return data[rear];
    }

    public void doubleArraySize() {
        int newarr[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newarr[i] = data[i];
        }
        data = newarr;// change refrence
    }

    public void print() {
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
