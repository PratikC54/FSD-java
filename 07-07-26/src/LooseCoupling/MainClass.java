package CouplingExample;

public class MainClass {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();
        System.out.println(notification.message());
    }
}

