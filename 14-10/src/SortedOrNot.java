import java.util.Arrays;

public class SortedOrNot {
    static boolean sortCheck(int [] arr){
        boolean sort = true;
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]) sort = false;
        }
        return sort;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        if (sortCheck(arr)) System.out.println("Array is sorted");
        System.out.println("Array is not sorted");

    }
}
