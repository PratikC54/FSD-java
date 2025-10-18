import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddcount=0,evencount=0;

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        for (int i : arr) {
            if (i==0) continue;
            if (i%2==0) evencount++;
            else oddcount++;
        }
        System.out.println("Numbers of even number : "+evencount);
        System.out.println("numbers of odd number : "+oddcount);
    }
}
