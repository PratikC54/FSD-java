
class test extends Thread {
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Thread "+threadId()+" is printing "+i);
            System.out.println("Thread "+currentThread().getName()+" is in "+getState()+" state");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        test obj = new test();

        test obj1 = new test();

        obj.start();
        System.out.println("Thread name is : "+obj.getName());
        System.out.println("Priority of Thread is : "+obj.getPriority());

            obj1.start();
            System.out.println("Thread name is : " + obj1.getName());
            System.out.println("Priority of Thread is : " + obj1.getPriority());

    }
}
