import java.util.LinkedList;
import java.util.Queue;

class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data=data;
    }
}


public class BFSInTree {
    static int height(Node1 root) {
        if (root==null) return 0;
        if(root.left!=null || root.right!=null) return 1+Math.max(height(root.left),height(root.right));
        return Math.max(height(root.left),height(root.right));
    }

    static void bfs(Node1 root , int height) {
        if(root==null) return;
        if(height==1) System.out.print(root.data+" ");
        bfs(root.left,height-1);
        bfs(root.right,height-1);

    }

    static void bfsUsingQueue(Node1 root) {
        if(root==null) return;
        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node1 temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);

        root.left = b;
        root.right = c;
        b.left = d;
        c.right = e;

        System.out.println("BFS traversal : ");
        for (int i=0;i<=height(root)+1;i++) {
            bfs(root,i);
            System.out.println();
        }

        System.out.println("BFS traversal using Queue : ");
        bfsUsingQueue(root);

    }
}
