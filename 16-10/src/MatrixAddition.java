public class MatrixAddition {
    static void Display(int[][] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int[][] arr2 = {{1,2},{3,4}};
        int[][] result = new int[arr.length][arr2[0].length];

        for (int i = 0;i< arr.length;i++)
            for (int j = 0;j<arr2[0].length;j++) result[i][j] = arr[i][j] + arr2[i][j];


        System.out.println("Matrix A : ");
        Display(arr);


        System.out.println("Matrix B : ");
        Display(arr2);

        System.out.println("resultant matrix is : ");
        Display(result);
    }
}