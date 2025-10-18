import java.util.Arrays;

public class ArrayDeepcopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] deepcopyarr = new int[arr.length];
        System.arraycopy(arr,0,deepcopyarr,0,arr.length);

    }
}
