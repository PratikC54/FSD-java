import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArraysOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int [size];

        System.out.println("Enter the elements in array ");
        for (int i=0;i< arr.length;i++) {
            System.out.print("Enter the "+i+"th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Final array : "+Arrays.toString(arr));

        for (int i=0;i<size;i++){

        }


    }
}
