import java.util.Arrays;

public class InplaceReversal {
    public static void main(String[] args) {
        int[] arr = {5,9,8,7,1,6,8,8,7,4,5};
        int i=0 , j=arr.length-1;
        while(i<=j){
            arr[i]=arr[j];
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
