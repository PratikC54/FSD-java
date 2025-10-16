import java.util.Scanner;

public class Array2D {
    static void Display(int[][] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row  = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns  = sc.nextInt();

        int[][] arr2 = new int[row][columns];
        System.out.println("Enter elements to array : ");

        for (int i=0;i< arr2.length;i++)
            for (int j=0;j<arr2[0].length;j++)  arr2[i][j] = sc.nextInt();

        Display(arr2);
    }
}
