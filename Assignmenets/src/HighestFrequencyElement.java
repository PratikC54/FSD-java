import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {

    public static int findHighestFrequency(int[] arr) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = arr[0];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 5, 3, 2, 1};


        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nElement with highest frequency: " + findHighestFrequency(arr));

    }
}