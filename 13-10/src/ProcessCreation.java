import java.io.IOException;

public class ProcessCreation {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("notepad.exe");
    }
}
