public class ToggleCase {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("kjgiIUHFIE");
        for (int i=0;i< str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) Character.toUpperCase(c);
            else str.append(" ");
        }
        System.out.println(str);
    }
}
