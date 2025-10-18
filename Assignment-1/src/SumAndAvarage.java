import java.util.Scanner;

public class SumAndAvarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        int sum=0;
        for (int i: arr) sum+=i;

        System.out.println("Sum of elements in array : "+sum);
        System.out.println("Avarage of elements in array : "+sum/size);
    }
}
