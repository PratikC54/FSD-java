import java.util.Scanner;

public class TargetSum {
    static void sum(int[] arr, int target){
        for(int i = 0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) System.out.println("["+i + " " + j+"]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        sum(arr,target);
    }
}
