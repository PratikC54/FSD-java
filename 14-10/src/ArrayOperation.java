import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
//        int [] arr = {1,2,3};       // Array literal declaration
//        int [] arr2 = new int[3];   // Array sizing declaration
//
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");       // For loop to traverse an array
//        }
//        System.out.println();
//
//        for(int j : arr){
//            System.out.print(j+" ");            // For-each loop to traverse an array
//        }
//        System.out.println();
//
//        int i = 0;
//        while(i< arr.length){
//            System.out.print(arr[i]);           // while loop to traversre an array
//        }
//
//        System.out.println(Arrays.toString(arr));   // another method to display content for array but only valid for 1D array .


        Integer[] arr5 = {1,2,5,4,3};
        Integer[] arr6 = arr5.clone();
        arr6[0] = 9;
        for (Integer i1 : arr5) System.out.println(i1);
        String[] arr7 = {"Pratik","modi"};
        String[] arr8 = arr7.clone();
        arr8[0]="XYZ";
        for (String ii : arr7) System.out.println(ii);

        int [][] arr2d = new int[2][2];
        int [][] arr2d2 = {{1,2},{3,4}};
    }
}
