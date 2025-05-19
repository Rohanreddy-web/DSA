package Trees;
public class Node<T> {
    public T data;
    Node<T> left;
    Node<T> right;
    public Node<Integer> next;
    public Node(T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
