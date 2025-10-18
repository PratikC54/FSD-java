import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        int insindex =0;
        for (int i=0;i<size;i++){
            if (arr[i]!=0){
                arr[insindex] = arr[i];
                insindex++;
            }
        }

        while (insindex<size){
            arr[insindex]=0;
            insindex++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
