class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

public class Trees {
    static void display(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    static int countNodes(Node root) {
        if (root == null) return 0;
        int leftcount = countNodes(root.left);
        int rightcount = countNodes(root.right);
        return 1 + leftcount + rightcount;
    }

    static int sum(Node root) {
        if (root == null) return 0;
        int sum = 0;
        return root.data + sum(root.left) + sum(root.right);

    }

    static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;

            int leftMax = max(root.left);
            int rightMax = max(root.right);

            return Math.max(root.data, Math.max(leftMax, rightMax));

    }

        public static void main (String[]args){
            Node root = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            root.left = b;
            root.right = c;
            b.left = d;
            c.right = e;

            System.out.print("Elements in tree : ");
            display(root);
            System.out.println("\nNumber of nodes : " + countNodes(root));
            System.out.println("sum of all data : " + sum(root));
            System.out.println("Maximum element : " + max(root));
        }
}