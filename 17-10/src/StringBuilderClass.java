public class StringBuilderClass {
    public static void main(String[] args) {

        //StringBuilder is used to achieve mutability in string.
        StringBuilder str = new StringBuilder("pratik");
        System.out.println(str);

        //Adding something to existing string.
        str.append(" Senapati");

        //find character from index
        System.out.println(str.charAt(2));

        //Delete character by index
        System.out.println(str.deleteCharAt(2));
        System.out.println(str.delete(0,2));

        //insert character at index
        System.out.println(str.insert(0,'P'));

        //Reverse the string
        System.out.println(str.reverse());


        System.out.println(str);
    }
}
