
abstract class AbTest{
    abstract void display();
    public void show(){
        System.out.println("show() -: This is a test show method inside a abstract class");
    }
}

class Btest extends AbTest {
    void display(){
        System.out.println("display() -: This is the defination of an abstract method in inherited class");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Btest obj = new Btest();
        obj.display();
        obj.show();
    }
}