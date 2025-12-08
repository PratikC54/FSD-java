/**
 * Bubble sort - An in-place sorting algorithm compare each element with its next element and swap if that element is greater than it's next element.
 * Time Complexity - Best case = O(n)
                     Avarage and worst case = O(n^2)
 */

import java.util.Arrays;

public class BubbleSort {
    static void bubble(int[] arr) {
        for(int i=0;i< arr.length-1;i++) {
            for(int j=0;j< arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,2,0,6,3};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println("After sorting using bubble sort");
        System.out.println(Arrays.toString(arr));

    }
}
