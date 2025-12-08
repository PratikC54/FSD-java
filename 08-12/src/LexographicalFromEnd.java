import java.util.Arrays;

public class LexographicalFromEnd {
    public static void main(String[] args) {

        String[] arr = {"orange","kiwi","build","mango","banana"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,
                (a,b)->a.charAt(a.length()-1)-b.charAt(b.length()-1)
        );
        System.out.println("After sorting using lexographical sort by end char");
        System.out.println(Arrays.toString(arr));
    }
}
