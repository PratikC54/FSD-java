import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static char findHighestFrequency(StringBuilder str) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int maxFreq = 0;
        char result = ' ';

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abababanscjasa");
        Map<Character,Integer> map = new HashMap<>();

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> duplicate : map.entrySet())
            if (duplicate.getValue()>1) System.out.println("Duplicate element : "+duplicate.getKey());

        System.out.println(findHighestFrequency(str)+" is the element with highest frequency");
    }
}
