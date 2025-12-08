import java.util.Arrays;

public class LexographicalSorting {
    static void lexographicsort(String[] arr) {
        for(int i=1;i<arr.length;i++) {
            String key = arr[i];
            int j=i-1;
            char k = arr[i].charAt(arr[i].length()-1);
            while(j>=0 && arr[j].compareTo(key)>0) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"orange","kiwi","build","mango","banana"};
        System.out.println(Arrays.toString(arr));
        lexographicsort(arr);
        System.out.println("After sorting using lexographical sort");
        System.out.println(Arrays.toString(arr));
    }
}
