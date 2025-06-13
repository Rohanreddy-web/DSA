package Trees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node<Integer> root=tree.createTree();
        Node<Integer> root1=tree.CreateTreeInput(true ,0, false);
        // System.out.println(root);
        // System.out.println(tree.NumberofNodes(root));
        // tree.printTree(root);
        // tree.printLevelNodes(root);
        // tree.postOrder(root);
        // tree.inOrder(root);
        // tree.removeLeafNode(root);
        // tree.printTree( tree.removeLeafNode(root));
        // System.out.println(tree.isBalanced(root));
        // tree.printnodewithouts(root);
        // System.out.println(tree.Diameter(root));
        System.out.println(tree.printLevelNodes(root));
        // System.out.println(tree.symetricTree(root));
        int []post={1,2,4,5,3,6,7};
        int[] pre={4,2,5,1,6,3,7};
        Node<Integer> start=tree.buildTree(post,pre);
        System.out.println(tree.printLevelNodes(start));
        // Node<Integer> result = tree.findNode(root, 5);
        // System.out.println(result!=null?"Node found at "+result:"Node not found");
        //BST
        BST btree=new BST();
        // Node<Integer> broot=btree.CreateTreeInput(true, 0, false);
        //   tree.printTree(root);
      //  System.out.println( btree.BSTsearch(root, 60));
       btree.Range(30, 60, root);
       System.out.println(btree.Ceil(root, 75)+"C");
      System.out.println(btree.checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
      int[] arr = {1, 2, 3, 4, 5, 6, 7};
      Node<Integer> r=btree.TreeBST(arr, 0, arr.length-1);
    //  tree.printTree(r);
      ArrayList<Integer>list=new ArrayList<>();
        btree.Roottonodepath(list,root, 60);
       int ans= btree.LCA(root, 60, 80);
       System.out.println(ans+"is the LCA");


    }
}
