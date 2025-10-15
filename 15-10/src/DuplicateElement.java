import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 12, 3, 4, 5, 2, 1, 6};

        System.out.println("Duplicate elements are:");


        /*
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) continue;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

         */

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) map.put(i,map.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> duplicate : map.entrySet())
            if (duplicate.getValue()>1) System.out.print(duplicate.getKey() +" ");
    }
}