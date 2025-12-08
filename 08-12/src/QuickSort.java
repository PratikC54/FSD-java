import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int low,int high) {
        if (low<high){
            int pivotIndex = partion(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    static int partion(int[] arr,int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high-1;j++) {
            i++;
            if(arr[j]<pivot) swap(arr,i,j);
        }
        swap(arr,i+1,high);
        return i+1;
    }


    static void swap(int[] arr,int low,int high){
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,2,0,6,3};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println("After sorting using quick sort");
        System.out.println(Arrays.toString(arr));
    }
}
