import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveElementFromArray {
    static int[] Duplicate(int[] arr){

        Set<Integer> ans = new HashSet<>();
        for (int x : arr){
            ans.add(x);
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (Integer item : ans) {
            result[i++] = item;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 12, 3, 4, 5, 2, 1, 6};
        System.out.println(Arrays.toString(Duplicate(arr)));

    }
}
