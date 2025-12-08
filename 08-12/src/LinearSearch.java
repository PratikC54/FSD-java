public class LinearSearch {
    static void linearSearch(int[] arr,int target) {
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) index=i+1;
        }
        if(index==-1) System.out.println("Element not present in array");
        else System.out.println("Element present at index:" +index);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,2,0,6,3};
        linearSearch(arr,9);
    }
}
