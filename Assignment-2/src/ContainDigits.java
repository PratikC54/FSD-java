import java.util.Scanner;

public class ContainDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean isnumeric = true;

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        for (char c : str.toCharArray())
            if (!Character.isDigit(c)) isnumeric = false;

        if (isnumeric) System.out.println("Entered string contains only digits.");
        else System.out.println("Entered string not containing onl digits" );
    }
}
