import java.util.HashMap;
import java.util.Map;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
//        System.out.println(map.size());
//        map.put(null,10);
//        map.put(1,12);
//        map.put(2,13);
//        System.out.println(map.entrySet());
//        System.out.println(map.getOrDefault());


        int[] arr = {1,2,1,4,5,7,5,3,4,3,7};
        for (int i : arr) map.put(i,map.getOrDefault(i,0)+1);
        System.out.println(map.entrySet());


        System.out.print("Elements : ");
        for (Map.Entry<Integer,Integer> duplicate : map.entrySet())
            if (duplicate.getValue()>1) System.out.print(duplicate.getKey() +" ");

        System.out.print("\n Frequency : ");
        map.entrySet();
        // OR
        for (Map.Entry<Integer,Integer> duplicate : map.entrySet())  System.out.print(duplicate.getValue() + " ");
        int large = 0;
        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int)mapElement.getKey();
        }


        System.out.println(map.values());

        }


        }
