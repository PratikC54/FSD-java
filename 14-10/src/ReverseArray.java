import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


        //to store the reverse array in a new array
        int [] arr2 = new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            arr2[j++] = arr[i];
        }
        System.out.println("\n"+Arrays.toString(arr2));
    }
}
