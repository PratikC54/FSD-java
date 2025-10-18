import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void Duplicate(int[] arr){
        int i=0;
        for (int j = 0; j< arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.print("[");
        for(int k=0;k<i+1;k++){
            System.out.print(arr[k]+",");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");

        Duplicate(arr);
    }
}
