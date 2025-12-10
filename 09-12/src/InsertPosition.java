public class InsertPosition {
    public static int insertIndex(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(insertIndex(arr,5));
    }
}
