/**
 * Selection Sort - Build the sorted array one element at a time. Take the next element and insert it into the correct position in the already sorted left part.
 * Time Complexity - Best case = O(n)
 *                      Avarage and worst case = O(n^2)
 */
import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,5,9,7,2,0,6,3};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println("After sorting using insertion sort");
        System.out.println(Arrays.toString(arr));

    }
}
