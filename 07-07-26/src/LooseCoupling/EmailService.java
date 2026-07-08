package CouplingExample;

public class EmailService implements NotificationService {
    public String message() {
        return "This is an e-mail notification";
    }
}
