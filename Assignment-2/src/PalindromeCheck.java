import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string to check palindrome : ");
        String str = sc.nextLine();

        int i=0,j=str.length()-1;
        boolean ispalidrome = false;
        while(i<j){
            if (str.charAt(i)==str.charAt(j)) ispalidrome=true;
            i++;
            j--;
        }
       if (ispalidrome) System.out.println(str+" is palindrome");
       else System.out.println(str+" is not pallindrome");
    }
}
