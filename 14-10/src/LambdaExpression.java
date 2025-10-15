
interface A {
    void display();
}

abstract class test{
    abstract void show();


}

class test10{
    int a;
    public void display(){
        System.out.println("Hii i am Pratik");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
       A a =() ->System.out.println("Hello");
       a.display();

//       Test t = () -> System.out.println("Hello");

      test t = new test(){
          public void show(){
              System.out.println("Hello World");
          }
      };
      t.show();

      test10 t4 = new test10();
      t4.display();

    }
}
