import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String str = "aaaaaaaaaaaaaaaaabbbsigtjrtfgydjhfhyyyy";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}