package Trees;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node<Integer> root=tree.CreateTree();
        // Node<Integer> root=tree.CreateTreeInput(true ,0, false);
        System.out.println(root);
        System.out.println(tree.NumberofNodes(root));
        
        // tree.printTree(root);
        tree.printLevelNodes(root);
        tree.postOrder(root);
        tree.inOrder(root);
        // tree.removeLeafNode(root);
        tree.printTree( tree.removeLeafNode(root));
    }
}
