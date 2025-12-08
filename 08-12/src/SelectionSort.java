/**
 * Selection Sort - Find the minimum element in the unsorted part and put it at the beginning by swapping. Repeat for all positions.
 *Time Complexity - Best case , Avarage and worst case = O(n^2)
 */

import java.util.Arrays;

public class SelectionSort {
    static void selection(int[] arr) {
        for(int i=0;i< arr.length-1;i++) {
            int min_index = i;
            for(int j=i;j<arr.length;j++) {
                if(arr[j]<arr[min_index]) min_index=j;
            }
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,9,7,2,0,6,3};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println("After sorting using selection sort");
        System.out.println(Arrays.toString(arr));

    }
}
