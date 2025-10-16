import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string to remove white spaces : ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ",""));

    }
}
