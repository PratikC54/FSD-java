class Node2{
    int data;
    Node2 left;
    Node2 right;
    Node2(int data){
        this.data=data;
    }
}

public class DiameterInTree {
    static int maxDiameter(Node2 root) {
        int maxDiameter1=0;
        if (root == null) return 0;

        int leftHeight = maxDiameter(root.left);
        int rightHeight = maxDiameter(root.right);

        int currentDiameter = leftHeight + rightHeight;

        maxDiameter1 = Math.max(maxDiameter1, currentDiameter);
        return 2 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        Node2 root = new Node2(1);
        Node2 b = new Node2(2);
        Node2 c = new Node2(3);
        Node2 d = new Node2(4);
        Node2 e = new Node2(5);

        root.left = b;
        root.right = c;
        b.left = d;
        c.right = e;

        System.out.println(maxDiameter(root));

    }
}
