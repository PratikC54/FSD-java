class TableThread extends Thread {
        private int number;

        public TableThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("\n Table of " + number );
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Table of " + number + " completed \n");
        }
    }
public class TablePrint {

    public static void main(String[] args) throws InterruptedException {
        TableThread table2 = new TableThread(2);
        TableThread table10 = new TableThread(10);


        System.out.println("Starting thread for table of 2...");
        table2.start();

        table2.join();

        System.out.println("Starting thread for table of 10...");
        table10.start();

        table10.join();

        System.out.println("All tables printed successfully!");

    }
}