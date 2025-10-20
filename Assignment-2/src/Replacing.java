import java.util.Scanner;

public class Replacing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string with spaces : ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ","-"));
    }
}
