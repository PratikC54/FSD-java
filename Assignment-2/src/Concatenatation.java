import java.util.Scanner;

public class Concatenatation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter a string to Concatenate : ");
        String str2 = sc.nextLine();

        System.out.println(str.concat(str2));
    }
}