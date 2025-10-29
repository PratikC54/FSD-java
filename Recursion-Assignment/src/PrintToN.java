import java.util.Scanner;

public class PrintToN {
    static void print(int num) {
        if(num==0) return;
        print(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to print : ");
        int num = sc.nextInt();
        print(num);

    }
}
