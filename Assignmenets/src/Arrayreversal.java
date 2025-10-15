import java.util.Arrays;

public class Arrayreversal {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,6,7,8,54,0};
        // Without using a new array
        System.out.println("Without using new array");
        for (int i = arr.length-1;i>0;i--) System.out.print(arr[i]+" ");


        // Using a new array
        int [] arr2 = new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            arr2[j++] = arr[i];
        }
        System.out.println("\n By creating a new array ");
        System.out.println("\n"+ Arrays.toString(arr2));
    }
}
