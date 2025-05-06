package Stacks_Queus;

import java.util.NoSuchElementException;

public class Queue {
    public static void main(String[] args)throws NoSuchElementException {
        // QueueusingArrays que=new QueueusingArrays();
        // que.enqueur(10);
        // que.enqueur(20);
        // que.enqueur(30);
        // que.enqueur(40);
        // que.dequeue();
        QueueLL<Integer> queue=new QueueLL<Integer>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        // System.out.println(que.size());
        // System.out.println(que.isEmpty());
        // System.out.println(que.front());
        // System.out.println(que.rear());
        // que.print();
        System.out.println(queue.front());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        // System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue()+" ");
        }
        // System.out.println(queue.isEmpty());
    }
}
