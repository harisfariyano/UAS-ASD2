package soal3;
public class binaryTreeApp {
     public static void main(String[] args) {
        var tree = new binaryTree();
        
        treeNode node;
        node = new treeNode(60);
        tree.insert(node);
        
        node = new treeNode(40);
        tree.insert(node);
        
        node = new treeNode(30);
        tree.insert(node);
        
        node = new treeNode(50);
        tree.insert(node);
        
        node = new treeNode(80);
        tree.insert(node);
     
        
        System.out.println("\nTraversal dengan InOrder : " );
        tree.inOrder();
        System.out.println("Traversal dengan Preorder : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan PostOrde : " );
        tree.postOrder();
        System.out.println();    
  }
}