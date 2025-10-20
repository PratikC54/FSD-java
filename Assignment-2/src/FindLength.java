import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        System.out.println("Length of string is : "+arr.length);
    }
}
