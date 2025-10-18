import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i =0;i<size;i++) arr[i] = sc.nextInt();

        for (int i=0;i<size-1;i++)
            for (int j=i;j<size-1;j++)
            if (arr[i]==arr[j]){
                System.out.print("First repeating element ; "+arr[i]);
                return;
            }
    }
}
