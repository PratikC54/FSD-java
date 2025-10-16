public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        String strr = "Helkp";
        String str1 = new String("pratik");
        System.out.println(str);

        //length of string
        System.out.println("length of string : "+str.length());

        //Concat two string
        System.out.println(str+" "+str1);
        System.out.println(str.concat(" Pratik"));
        System.out.println(str+"Pratik");

        //retrive character and index
        System.out.println("Character is : "+str.charAt(2));
        System.out.println("character present at index : "+str.indexOf("H"));

        //Convertion of case
        System.out.println("String in lowercse : "+str.toLowerCase());
        System.out.println("String in uppercase : "+str.toUpperCase());

        //Comparing
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
        System.out.println(str.equalsIgnoreCase(str1));

        //element check
        System.out.println(str.contains("H"));

        //Replace
        System.out.println(str.replace("H","h"));

        //Lexographical difference - Converted into unicode(ASCII) value and returns the difference.
        //The first occurance of differnence will be returned.
        System.out.println(str.compareTo(strr));

        //Substring
        System.out.println(str.substring(1));

        //substring(beginindex,endindex) it includes the begin-index but not the last-index
        System.out.println(str.substring(2,5));

        //to achieve mutability
        str = str1.substring(0,5);
        System.out.println(str);

    }
}
