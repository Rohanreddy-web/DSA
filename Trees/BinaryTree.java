package Trees;

import java.util.Scanner;
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
    public void printLevelNodes(Node<Integer> node) {
        if (node == null) {
            return;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node<Integer> nodepoiNode = queue.poll();
            System.out.print(nodepoiNode.data + ":");

            if (nodepoiNode.left != null) {
                System.out.print("L:" + nodepoiNode.left.data + ",");
                queue.add(nodepoiNode.left);
            } else {
                System.out.print("L:-1,");
            }

            if (nodepoiNode.right != null) {
                System.out.print("R:" + nodepoiNode.right.data);
                queue.add(nodepoiNode.right);
            } else {
                System.out.print("R:-1");
            }

            System.out.println();
        }
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
    
}
