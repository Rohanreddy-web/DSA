package Trees;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Class for Binary Tree operations
public class BinaryTree {

    // Manually creates and returns a simple binary tree
    public Node<Integer> CreateTree() {
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> rootLeft = new Node<Integer>(2);
        Node<Integer> rootRight = new Node<Integer>(3);
        Node<Integer> leafR = new Node<Integer>(4);
        Node<Integer> leafL = new Node<Integer>(5);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = leafL;
        rootRight.right = leafR;
        return root;
    }

    // Recursively builds a binary tree from user input (-1 means no node)
    public Node<Integer> CreateTreeInput(boolean isRoot, int i, boolean isLeft) {
        Scanner sc = new Scanner(System.in);
        if (isRoot) {
            System.out.println("Enter Root");
        } else {
            if (isLeft) {
                System.out.println("Enter Leftnode of " + i);
            } else {
                System.out.println("Enter Rightnode of " + i);
            }
        }

        int data = sc.nextInt();
        if (data == -1) {
            return null; // no node created
        }

        Node<Integer> root = new Node<Integer>(data);
        // Recursively build left and right subtrees
        Node<Integer> rootLeft = CreateTreeInput(false, data, true);
        Node<Integer> rootRight = CreateTreeInput(false, data, false);
        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }

    // Counts and returns total number of nodes in the tree
    public int NumberofNodes(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftcount = NumberofNodes(root.left);
        int rightcount = NumberofNodes(root.right);
        return 1 + leftcount + rightcount;
    }

    // Builds a binary tree using level-order (BFS) input
    public Node<Integer> CreateLevelNodes() {
        Queue<Node<Integer>> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root Node: ");
        int data = sc.nextInt();
        Node<Integer> root = new Node<Integer>(data);
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<Integer> nodepointer = queue.poll();

            System.out.print("Enter leftNode of " + nodepointer.data + ": ");
            int left = sc.nextInt();
            if (left != -1) {
                Node<Integer> leftNode = new Node<Integer>(left);
                nodepointer.left = leftNode;
                queue.add(leftNode);
            }

            System.out.print("Enter rightNode of " + nodepointer.data + ": ");
            int right = sc.nextInt();
            if (right != -1) {
                Node<Integer> rightNode = new Node<Integer>(right);
                nodepointer.right = rightNode;
                queue.add(rightNode);
            }
        }
        return root;
    }

    // Prints the tree in level-order with child node references
    public ArrayList<ArrayList<Integer>> printLevelNodes(Node<Integer> node) {
        if (node == null) {
            return new ArrayList<>();
        }
       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            ArrayList<Integer> currentlist=new ArrayList<>();//create a new list every time
            Node<Integer> nodepoiNode = queue.poll();
            currentlist.add(nodepoiNode.data);

            if (nodepoiNode.left != null) {
                currentlist.add(nodepoiNode.left.data);
                queue.add(nodepoiNode.left);
            }
            if (nodepoiNode.right != null) {
                  currentlist.add(nodepoiNode.right.data);
                queue.add(nodepoiNode.right);
            }
            list.add(currentlist);

        }
        return list;
    }

    // Prints the tree in pre-order format with structure indication
    public void printTree(Node<Integer> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + ":");
        if (node.left != null) {
            System.out.print("L" + node.left.data + ", ");
        }
        if (node.right != null) {
            System.out.print("R" + node.right.data);
        } else {
            System.out.print("null");
        }
        System.out.println();

        printTree(node.left);
        printTree(node.right);
    }

    // Post-order traversal: Left → Right → Root
    public void postOrder(Node<Integer> node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.err.println(node.data);
    }

    // In-order traversal: Left → Root → Right
    public void inOrder(Node<Integer> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.err.println(node.data);
        inOrder(node.right);
    }
    //Node without sibling
    public void printnodewithouts(Node<Integer> root){
        if (root==null) {
            return;
        }
        if (root.left!=null && root.right==null) {
            System.out.println(root.data);
        }
          if (root.right!=null && root.left==null) {
            System.out.println(root.data);
        }
        printnodewithouts(root.left);
         printnodewithouts(root.right);
         return;
    }
    //Remove leaf Nodes in a Binary tree
    public Node<Integer> removeLeafNode(Node<Integer> root){
        if(root==null){
            return null;
        }
        if (root.left==null && root.right==null) {
            return null;
        }
       Node<Integer>left= removeLeafNode(root.left);
        Node<Integer> right=removeLeafNode(root.right);
        root.left=left;
        root.right=right;
        return root;
    }
    //Check tree is Balanced or not
    public int height(Node<Integer> root){
        if (root==null) {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return 1+Math.max(leftheight, rightheight);
    }
    public boolean isBalanced(Node<Integer> root){
        if (root==null) {
            return true;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(Math.abs(leftheight-rightheight)>1){
            return false;
        }
        boolean isLSTB=isBalanced(root.left);
        boolean isRSTB =isBalanced(root.right);
        if (isLSTB && isRSTB) {// if both true
            return true;
        }
        else{
            return false;
        }
        
    }
    //Diameter of a tree
       int max=0;
       public Integer postOrder;
        public  int Diameter(Node<Integer> root){
            if (root==null) {
                return 0;
            }
            //root node;
            int lefth=height(root.left);
            int rihtth=height(root.right);
            max=Math.max(max,lefth+rihtth);
            //leftsub tree and right sub tree
            Diameter(root.left);
            Diameter(root.right);
            return max;

        }
}
