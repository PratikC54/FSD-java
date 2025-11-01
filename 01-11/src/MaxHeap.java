import java.util.Arrays;

public class MaxHeap {
    public static void buildHeap(int[] arr) {
        int nonleaf = Math.floorDiv(arr.length, 2);
        for(int i=nonleaf;i>=0;i--) heapify(arr,arr.length,i);
    }

    public static void heapify(int[] arr,int n,int i) {
        int leftchild=2*i+1;
        int rightchild=2*i+2;

    }


    public static void main(String[] args) {
        int[] arr = {1,5,9,7,8,6,8,14,24,69};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));

    }
}
