package Trees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node<Integer> root=tree.CreateTree();
        // Node<Integer> root=tree.CreateTreeInput(true ,0, false);
        // System.out.println(root);
        System.out.println(tree.NumberofNodes(root));
        
        // tree.printTree(root);
        // tree.printLevelNodes(root);
        // tree.postOrder(root);
        // tree.inOrder(root);
        // tree.removeLeafNode(root);
        // tree.printTree( tree.removeLeafNode(root));
        // System.out.println(tree.isBalanced(root));
        // tree.printnodewithouts(root);
        // System.out.println(tree.Diameter(root));
        // System.out.println(tree.printLevelNodes(root));
        int []post={1,2,4,5,3,6,7};
        int[] pre={4,2,5,1,6,3,7};
        Node<Integer> start=tree.buildTree(post,pre);
        System.out.println(tree.printLevelNodes(start));
    }
}
