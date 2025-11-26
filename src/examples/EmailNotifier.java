package examples;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message, String recipient){
        System.out.println("Connecting to SMTP server...");
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}
