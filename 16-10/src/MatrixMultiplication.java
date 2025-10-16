import java.util.Scanner;

public class MatrixMultiplication {

    static void Display(int[][] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Multiply(int[][] arr , int[][] arr2 , int[][] result ){
        if(arr[0].length!= arr2.length) System.out.println("Multiplication condition not satisfied");
        for (int i = 0;i< arr.length;i++){
            for(int j=0;j< arr2[0].length;j++){
                for (int k=0;k<arr[0].length;k++)
                    result[i][j] += arr[i][k] * arr2[k][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in matrix A :");
        int row1 = sc.nextInt();
        System.out.print("Enter the number of columns in matrix A :");

        int col1 = sc.nextInt();
        System.out.print("Enter the number of rows in matrix B :");
        int row2 = sc.nextInt();
        System.out.print("Enter the number of columns in matrix B :");
        int col2 = sc.nextInt();

        int[][] arr = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] result = new int[row1][col2];


        System.out.println("Enter elements in first array");
        for (int i=0;i<row1;i++)
            for (int j=0;j<col1;j++)
                arr[i][j] = sc.nextInt();


        System.out.println("Enter elements in second array");
        for (int i=0;i<row2;i++)
            for (int j=0;j<col2;j++)
                arr2[i][j] = sc.nextInt();

        Multiply(arr,arr2,result);
        System.out.println("Matrix A : ");
        Display(arr);

        System.out.println("\nMatrix B : ");
        Display(arr2);

        System.out.println("\nResultant Matrix : ");
        Display(result);

    }
}
