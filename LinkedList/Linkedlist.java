import java.util.ArrayList;
import java.util.Scanner;

import Trees.Node;

public class Linkedlist {
    public static Node<Integer> createLinkedlist() {
        // to store address of objects
        Node<Integer> n1;
        Node<Integer> n2;
        Node<Integer>n3;
        Node<Integer>n4;
        //object creation
        n1= new Node<>(10);
        n2= new Node<>(20);
        n3= new Node<>(30);
        n4=new Node<Integer>(23);
        //links
        n1.next = n2;
        n2.next = n3;
        n3.next=n4;
        n4.next=null;
        return n1;
    }
    public static void print(Node<Integer> head) {
        Node<Integer> movehead = head;
        while (movehead != null) {
            System.out.print(movehead.data + "->");
            movehead = movehead.next;
        }
        System.out.println();
    }
    
    public static int Size(Node<Integer> head){
        int size=0;
        Node<Integer>head1 = head;
        while (head1!=null) {
            size++;
            head1=head1.next;
        }
        return size;


    }
    public static int printithnode(Node<Integer> head ,int i){
        Node<Integer>head1 = head;//single pointer overwrite agin and agin till null
        int index= 0;
        while (head1!=null) {
            if (index==i) {
                return head1.data;
            }
            index++;
            head1=head1.next;
        }
        return -1;
    }
    public static Node <Integer> CreteDynamicNodes(){
       Scanner sc=new Scanner(System.in);
       int data=sc.nextInt();
       Node<Integer> head=null,tail=null;//pointers which holds Node object Address
        while (data!=-1) {
            Node<Integer> node=new Node<Integer>(data);
            if (head==null) {
                head=node;
                tail=node;
            }
            else{
                // Node<Integer>tail=head;//pointer which holds Node object Address
                // while (tail.next!=null) {//O{N*2}
                //     tail=tail.next;//go to next address
                // }
                // tail.next=node;
                tail.next=node;//O(N)
                tail=tail.next;//Move tail pointer
            }
            data=sc.nextInt();

        }
        return head;
    }
    public static Node<Integer> Insertnode(Node<Integer> head, int index, int data){
        Node <Integer>headpointer=head;
        Node<Integer> insertnode=new Node<Integer>(data);
        int i=0;
        if (index==0){
            insertnode.next = head;
            return insertnode;
        }
        while ( (headpointer != null) && (index > 0 && i != index - 1)) {
			headpointer = headpointer.next;
			i++;
		}
		if (headpointer == null) {//if in valid index it go till end node
			return head;
		}
        Node<Integer> temp2=headpointer.next;
        headpointer.next=insertnode;
        insertnode.next=temp2;
        return head;


    }
    public static Node<Integer> Deletenode(Node<Integer> head,int i){
        Node <Integer> priv=head,nextp=head;
        if(head==null){
            return head;
        }
        if (i == 0) {
            return head.next;
        }
        int count=0;
        while (count!=i-1) {
            priv=priv.next;
            count++;
        }
        nextp=priv.next;
        Node <Integer> temp=nextp.next;
        // priv.next=null;//break
        priv.next=temp;
        return head;

    }
    //with creating a extra space;
    public static Node<Integer> ReverseList(Node<Integer> head){
        Node<Integer>headpoint=head;
        ArrayList<Integer> arr=new ArrayList<>();
       while (headpoint!=null) {
        arr.add(headpoint.data);
        headpoint=headpoint.next;
       }
       Node<Integer> newNode=new Node <Integer>(arr.get(arr.size()-1));
       Node<Integer> revpointer=newNode;
       for (int i = arr.size()-2; i>=0; i--) {
        revpointer.next = new Node<>(arr.get(i));
        revpointer=revpointer.next;//moving reversepointer  
       }
    //    ListNode priv=null;
    //    ListNode curr=head;
    //    ListNode next=null;
    //    while(curr!=null){
    //        next=curr.next;//storing next address befor cutting link
    //        curr.next=priv;//cutting link
    //        priv=curr;
    //        curr=next;
    //    }
    //    return priv;
       
       return newNode;
    }

    public static void main(String[] args) {
        Node<Integer> head =createLinkedlist();
        print(head);
        // System.out.println();
        // System.out.println(Size(head));
        System.out.println();
        // System.out.println(printithnode(head, 3));
        // Node <Integer> newhead=Insertnode(head, 2,10);
        // Node <Integer> del=Deletenode(head, 3);
        // print(del);
        Node<Integer> rev = ReverseList(head);
        System.out.println("Reversed List:");
        print(rev); 
        
    }
}
