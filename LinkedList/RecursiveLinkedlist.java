import java.util.ArrayList;
import java.util.Collections;

import Trees.Node;

public class RecursiveLinkedlist {
    public static Node<Integer> createLinkedlist() {
        // to store address of objects
        Node<Integer> n1;
        Node<Integer> n2;
        Node<Integer>n3;
        Node<Integer>n4;
        //object creation
        n1= new Node<>(1);
        n2= new Node<>(4);
        n3= new Node<>(5);
        n4=new Node<Integer>(2);
        //links
        n1.next = n2;
        n2.next = n3;
        n3.next=n4;
        n4.next=null;
        return n1;
    }
    public static Node<Integer> createLinkedlist2(){
        Node<Integer> n5;
        Node<Integer> n6;
        Node<Integer>n7;
        Node<Integer>n8;
        n5= new Node<>(1);
        n6= new Node<>(2);
        n7= new Node<>(3);
        n8=new Node<Integer>(4);
        //links
        n5.next = n6;
        n6.next = n7;
        n7.next=n8;
        n8.next=null;
        return n5;
    }
    public static void print(Node<Integer> head){
     if (head==null) {
        return;
     }
     //just print reverse using recursion stack
    //  print(head.next);
     System.out.print(head.data+"->");
     print(head.next);
     return;
    }
    public static Node<Integer> insert(Node<Integer> head,int element,int pos){
        Node<Integer>headpointer=head;
        if (headpointer==null) {
            return head;
        }
        if (pos==0) {//base case
            Node<Integer> newNode=new Node<Integer>(element);
            newNode.next=headpointer;
            return newNode;
        }
        else{
            Node<Integer> smallhead=insert(headpointer.next, element, pos-1);//recursive call
            headpointer.next=smallhead;
            return headpointer;
        }
    }
    public static Node<Integer> deletNode(Node<Integer> head,int pos){
        Node<Integer> headpoi=head;
        if (headpoi==null) {
            return head;
        }
        if (pos==0) {//base case
            headpoi=headpoi.next;
            return headpoi;
        }
        else{
            Node<Integer> smallhead= deletNode(headpoi.next, pos-1);//recursive call
            headpoi.next=smallhead;
            return headpoi;
        }
    }
    public static Node<Integer> reversNodes(Node<Integer> head){
        if (head==null||head.next==null) {
            return head;
        }
        else{
            Node<Integer> rev=reversNodes(head.next);
            Node<Integer> fornt=head.next;
            fornt.next=head;
            head.next=null;
            return rev;
        }
    }
     static ArrayList<Integer> arr=new ArrayList<>();
     public static Node<Integer> Merge(Node<Integer>head,Node<Integer>head2){
        Node<Integer>temp=head;
        Node<Integer> temp2=head2;
        while (temp!=null) {
            arr.add(temp.data);
            temp=temp.next;
        }
        while (temp2!=null) {
            arr.add(temp2.data);
            temp2=temp2.next;
        }
    Collections.sort(arr);
    System.out.println(arr);
    Node<Integer> newNode=new <Integer>Node(arr.get(0));
       Node<Integer> revpointer=newNode;
       for (int i = 1; i<=arr.size()-1; i++) {
        revpointer.next = new Node<>(arr.get(i));
        revpointer=revpointer.next;//moving reversepointer  
       }

     return newNode;
    }
    // public static Node<Integer> oddeven(Node<Integer> head, int pos) {
    //     if (head == null || head.next == null){ 
    //         return head;
    //     }

    //     Node<Integer> odd = new Node<Integer>(head.data);
    //     Node<Integer> ev = new Node<>(head.next.data);
    //     Node<Integer> oddCurr = odd;
    //     Node<Integer> evCurr = ev;
    //     Node<Integer> curr = head.next.next;
    //     while (curr != null) {
    //         if (pos % 2 == 0) {
    //             ev.next = new Node<>(curr.data);
    //             evCurr = evCurr.next;
    //             pos++;
    //             curr = curr.next;
    //         } else {
    //             odd.next = new Node<>(curr.data);
    //             oddCurr = oddCurr.next;
    //             pos++;
    //             curr = curr.next;
    //         }
        
    //     }
    //     oddCurr.next = ev;
    //     return odd;
    // }
    public static Node<Integer> ODDEVEN(Node<Integer> head){
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        Node<Integer> haNode=head;
        Node<Integer> datachange=head;
        while (haNode!=null) {
            if (haNode.data%2!=0) {
                odd.add(haNode.data);
                haNode=haNode.next;
            }
            else{
              even.add(haNode.data);
              haNode=haNode.next;
            }
        }
        int i=0;
        int j=0;
        while (i<odd.size()) {
            datachange.data=odd.get(i);
            i++;
            datachange=datachange.next;
        }
        while (j<even.size()) {
            datachange.data=even.get(j);
            j++;
            datachange=datachange.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head=createLinkedlist();
        Node<Integer> head2=createLinkedlist2();
        // Node<Integer>h=insert(head, 60, 2);
        // System.out.println(h);
        print(head);
        System.out.println();
        // Node<Integer> i=deletNode(head, 3);
        // // Node<Integer>revsnode=reversNodes(head);
        // print(revsnode);
        // Node<Integer> HE=Merge(head,head2);
        // print(HE);
        Node<Integer> oddeven=oddeven(head, 3);
        print(oddeven);
        


    }
}
