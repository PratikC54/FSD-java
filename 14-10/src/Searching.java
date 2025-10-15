public class Searching {
    static int LinearSearch(int [] arr,int n){
        int index = -1;
        for (int i=0;i< arr.length;i++){
            if(n==arr[i]) index = i;
        }
        return index;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end-start) / 2;

            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("Element present at "+LinearSearch(arr,7));
        System.out.println("Element present at "+binarySearch(arr,7));
    }
}
