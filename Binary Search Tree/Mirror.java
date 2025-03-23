

public class Mirror {
  public static class Node {
    int data;
    Node left;
    Node right;
    public Node (int data ) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  
  }
  public static Node createMirror (Node root) {
    if (root == null) return null;

    Node left = createMirror(root.left);
    Node right = createMirror(root.right);

    root.left = right;
    root.right = left;
    return root;
  }
  public static void preorder (Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    
    preorder(root.right);
    
  }
  public static void main (String args[] ) {
    System.out.println("Mirror of a binary tree");
    Node root = new Node (8);
    root.left = new Node (5);
    root.right = new Node (10);
    root.left.left = new Node (2);
    root.left.right = new Node (6);
    root.right.left = new Node (9);
    root.right.right = new Node (12);
    
    System.out.println("original tree");
    preorder(root);
    System.out.println();
    System.out.println("mirror of tree");
    Node mirror = createMirror(root);
    preorder(mirror);
  }
}