import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,1,4,5,7,5,3,4,3,7};
        for (int i : arr) map.put(i,map.getOrDefault(i,0)+1);
        System.out.println(map.entrySet());


        System.out.print("Elements : ");
        for (Map.Entry<Integer,Integer> duplicate : map.entrySet())
            System.out.print(duplicate.getKey() +" ");

        System.out.print("\n Frequency : ");
        System.out.println(map.values());
    }
}
