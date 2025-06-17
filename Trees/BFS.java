package Trees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    // Build tree using level-order (BFS) input
    public Node<Integer> createLevelNodes() {
        Queue<Node<Integer>> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root Node: ");
        int data = sc.nextInt();
        Node<Integer> root = new Node<>(data);
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<Integer> nodepointer = queue.poll();
            System.out.print("Enter leftNode of " + nodepointer.data + ": ");
            int left = sc.nextInt();
            if (left != -1) {
                Node<Integer> leftNode = new Node<>(left);
                nodepointer.left = leftNode;
                queue.add(leftNode);
            }

            System.out.print("Enter rightNode of " + nodepointer.data + ": ");
            int right = sc.nextInt();
            if (right != -1) {
                Node<Integer> rightNode = new Node<>(right);
                nodepointer.right = rightNode;
                queue.add(rightNode);
            }
        }
        return root;
    }

    // Print the tree in level order traversal, returning list of levels
    public ArrayList<ArrayList<Integer>> printLevelNodes(Node<Integer> node) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node<Integer> current = queue.poll();
                
                currentLevel.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    // Find a node with the target value using BFS traversal
    public Node<Integer> findNode(Node<Integer> root, int target) {
        if (root == null) {
            return null;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<Integer> current = queue.poll();

            if (current.data == target) {
                return current;
            }

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return null; // Not found
    }

    // Zigzag Level Order Traversal
    public List<List<Integer>> zigzagLevelOrder(Node<Integer> root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        int level = 0; // track level number

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node<Integer> currentNode = queue.poll();
                currentLevel.add(currentNode.data);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            if (level % 2 == 1) {
                Collections.reverse(currentLevel);
            }

            result.add(currentLevel);
            level++;
        }

        return result;
    }
}
