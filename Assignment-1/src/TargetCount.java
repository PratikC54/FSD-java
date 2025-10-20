import java.util.Scanner;

public class TargetCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        System.out.print("Enter the target to count: ");
        int target = sc.nextInt();
        for (int i : arr) if (i==target) count++;
        System.out.println(target+" found "+count+" times");
    }
}
