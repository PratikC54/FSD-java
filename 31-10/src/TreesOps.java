class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

public class TreesOps {
    static int height(Node root) {
        if (root==null) return 0;
        if(root.left!=null || root.right!=null) return 1+Math.max(height(root.left),height(root.right));
        return Math.max(height(root.left),height(root.right));
    }


    static void preOrderTraversal(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    static void inOrderTraversal(Node root) {
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root) {
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        root.left = b;
        root.right = c;
        b.left = d;
        c.right = e;

        System.out.println(height(root));

        System.out.println("\nPre order traversal : ");
        preOrderTraversal(root);

        System.out.println("\nIn order traversal : ");
        inOrderTraversal(root);

        System.out.println("\nPost order traversal : ");
        postOrderTraversal(root);

    }
}
