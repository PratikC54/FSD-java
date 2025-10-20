import java.util.Locale;
import java.util.Scanner;

public class CaseChange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("string in uppercase : "+str.toUpperCase());
        System.out.println("string in lowercase : "+str.toLowerCase());
    }
}
