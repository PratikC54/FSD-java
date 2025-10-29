
public class MaxElementInArray {
    static int maximumInArray(int[] arr,int index) {
        if(index==0) return arr[0];
        int possible = maximumInArray(arr,index-1);
        return Math.max(arr[index],possible);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,7,8,6,2,0,4,7,5,6};
        System.out.println(maximumInArray(arr,arr.length-1));
    }
}
