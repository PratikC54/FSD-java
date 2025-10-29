import java.util.Scanner;

public class SumOfN {
    static int sum(int num) {
        if(num==0) return 0;
        return num+sum(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to sum : ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
