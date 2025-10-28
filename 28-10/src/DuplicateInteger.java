import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateInteger {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,1,5,2,4,5,1,3};

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i,0)+1);
        System.out.print("Duplicate elements are: ");
        for (Map.Entry<Integer,Integer> freq : map.entrySet()){
            if(freq.getValue()>1) System.out.print(freq.getKey()+" ");
        }


        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i : arr) {
            if (!seen.add(i)) duplicates.add(i);
        }

        System.out.println("\nDuplicate elements are: " + duplicates);
    }
}
