import java.util.Scanner;

public class ManualStringCompare {
    static boolean equals(String str,String str2){
        boolean isequal = false;
        for (int i=0;i<Math.max(str.length(),str2.length());i++){
            if (str.charAt(i)==str2.charAt(i)) isequal = true;
        }
        return isequal;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter another string : ");
        String str2 = sc.nextLine();

        if (equals(str,str2)) System.out.println("Both strings are equal");
        else System.out.println("Strings are not equal");
    }
}
