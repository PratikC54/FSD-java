
interface Op {
    int operation(int x , int y);
}

public class LambdaOperation {
    public static void main(String[] args) {
        Op s = (int x , int y) -> {
            return x+y;
        };
        System.out.println("Addition : "+s.operation(5,5));
        Op s1 = (int x , int y) -> {
            return x-y;
        };
        System.out.println("substraction : "+s1.operation(15,5));
        Op m = (int x , int y) -> {
            return x*y;
        };
        System.out.println("Multiplication : "+m.operation(5,5));
    }
}
