import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;           // Shallow copying

//        System.out.println(arr.toString());

        int[] arr3 = arr.clone();   // it doesn't copy the reference but clone the array really into heap .
        int[] arr4 = Arrays.copyOf(arr, arr.length);

    }
}
