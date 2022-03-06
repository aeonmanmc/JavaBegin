package questions;

class SymmetricTree {

    static Node root;
   
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.right.left = new Node(4); 
        tree.root.right.right = new Node(3); 
        boolean output = tree.isSymmetric(tree.root); 
        if (output)
            System.out.println("1"); 
        else
            System.out.println("0"); 
    } 
}

/*
For example, this binary tree is symmetric:

     1
   /   \
  2     2
 / \   / \
3   4 4   3
But the following is not:

    1
   / \
  2   2
   \   \
   3    3*/
