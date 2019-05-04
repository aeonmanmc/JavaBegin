class InvertBinTree{
    
    public static void main(String[] args) {
        
        Node lNode = new Node("B", null, null);
        Node rNode = new Node("C", null, null);
        Node root = new Node("A", lNode, rNode);

        inOrder(root);
        root = invertTree(root);
        System.out.print("\n");
        inOrder(root);

    }

    private static Node invertTree(Node root) {
        
        if (root == null) {
            return null;
        }
        
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    private static class Node{

        private String value;
        private Node left;
        private Node right;

        public Node(String value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private static void inOrder(Node root){

        if(root == null) return;

        System.out.print(root.value + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

}