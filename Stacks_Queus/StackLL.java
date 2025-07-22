package Stacks_Queus;
public class StackLL<T> {
    private int topindex = -1;
    private Node<T> pushNode;
    private Node<T> head = null;

    public void push(T data) {
        if (head == null) {
            pushNode = new Node<T>(data);
            head = pushNode;
            topindex++;
        } else {
            pushNode = new Node<T>(data);
            pushNode.next = head;
            head = pushNode;
            topindex++;

        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return topindex + 1;
    }

    public T pop() {
        T popdata = head.data;
        Node<T> pophead = head;// privers address
        head = head.next;// move head
        pophead.next = null;// Break the link to help garbage collection
        topindex--;
        return popdata;
    }

    public T top() {
        return head.data;
    }
   

}
