import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        int j=0;
        for (int i=0;i<size;i++){
            if (arr[i]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
