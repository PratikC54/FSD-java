import java.util.HashMap;
import java.util.Map;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 12, 3, 4, 5, 2, 1, 6};

        System.out.println("Duplicate elements are:");

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) map.put(i,map.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> duplicate : map.entrySet())
            if (duplicate.getValue()>1) System.out.print(duplicate.getKey() +" ");
    }
}