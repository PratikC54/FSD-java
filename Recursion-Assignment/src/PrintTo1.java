import java.util.Scanner;

public class PrintTo1 {
    static void Print1(int num) {
        if(num==0) return;
        System.out.print(num+" ");
        Print1(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to print : ");
        int num = sc.nextInt();
        Print1(num);
    }

}
