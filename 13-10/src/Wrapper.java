public class Wrapper {

    public static void main(String[] args) {
        String str = "2";
        String str2 = "3";

        System.out.println(str+str2);

        int num = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);

        System.out.println(num*num2);


        Integer a= null;
        System.out.println(a.intValue());
    }
}
