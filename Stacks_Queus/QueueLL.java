package Stacks_Queus;

import java.util.NoSuchElementException;

public class QueueLL<T> {
    private Node<T> front;
    private Node<T> rear ;
    private int size;

    public QueueLL() {
        front = null;
        rear  = null;
        size = 0;

    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        Node<T> newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }
        size++;
    }

    public T dequeue() throws NoSuchElementException {
        if (front == null) {
            rear  = null;
            throw new NoSuchElementException("queue is Empty >>>>");
        }

        Node<T> temp = front.next;
        T deque = front.data;
        front.next = null;
        front = temp;
        if (front==null) {
            rear=null;
        }
        size--;
        return deque;

    }

    public T front() {
        return front.data;

    }

    public int size() {
      return size;
    }
}
