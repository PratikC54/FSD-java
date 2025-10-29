import java.util.Arrays;

public class PrintArrayInReverse {
    static void printArray(int[] arr , int index) {
        if(index<0) return;
        printArray(arr,index-1);
        System.out.print(arr[index]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,7,8,6,2,0,4,7,5,6};
        printArray(arr, arr.length-1);
    }
}
