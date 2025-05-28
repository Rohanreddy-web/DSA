package Trees;
import java.util.Scanner;

public class BST {
 /*     50
       /  \
     30    70
    / \    / \
  20  40  60  80*/
  // Time-Complexity: O(H)WhereHIsTheHeightOfTheTree

  //Search in BST
   public boolean BSTsearch(Node<Integer>node,int key){
        if (node==null) {
            return false;
        }
        if (key==node.data) {
            return true;
        }
        if (key<node.data) {
            boolean ans=BSTsearch(node.left, key);
            return ans;
        }
        else{
            boolean ans=BSTsearch(node.right, key);
            return ans;
        }
    }
    //Range in BST
    public void Range(int k1,int k2,Node<Integer> node){
        if (node==null) {
            return;
        }
        if (node.data>=k1 && node.data<=k2) {
            System.out.print(node.data+" ");
        }
        if (node.data<k1) {
            Range(k1, k2, node.right);
            return;
        }
        else if (node.data>k2) {
            Range(k1, k2, node.left);
            return;
        }
        else{
             Range(k1, k2, node.right);
              Range(k1, k2, node.left);
              return;
        }

    }
    //Cile in BST
   public int Ceil(Node<Integer> node, int key) {
    int ceil = Integer.MAX_VALUE;
    while (node != null) {
        if (node.data == key) {
            return node.data;
        }
        if (node.data > key) {
            ceil = node.data;
            node = node.left;
        } else {
            node = node.right;
        }
    }
    return ceil;
}
 //Floor in BST
 public int Floor(Node<Integer> node, int key) {
    int fl = Integer.MIN_VALUE;
    while (node != null) {
        if (node.data == key) {
            return node.data;
        }
        if (node.data < key) {
            fl = node.data;
            node = node.right;
        } else {
            node = node.left;
        }
    }
    return fl;
}
//Check if give is BST or not
public boolean checkBST(Node<Integer> node, int minval, int maxval) {
    if (node == null) {
        return true;
    }
    if (node.data >= maxval || node.data <= minval) {//out of range
        return false;
    }

    return checkBST(node.left, minval, node.data) && checkBST(node.right, node.data, maxval);
}
//Creating a BST using Inorder List
public Node<Integer> TreeBST(int[]arr,int stindex,int endindex){
   if (stindex > endindex) {
        return null;
    }
    int mid=(stindex+endindex)/2;
    Node<Integer> root=new Node<Integer>(arr[mid]);
    Node<Integer>leftTree=TreeBST(arr, stindex, mid-1);
     Node<Integer>rightTree=TreeBST(arr, mid+1, endindex);
     root.left=leftTree;
     root.right=rightTree;
     return root;
}


}

