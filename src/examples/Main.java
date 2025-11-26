package examples;

public class Main {
    public static void main(String[] args) {
        MessageSender mySender = new SmsSender();
        mySender.send("Hello");
        mySender = new EmailSender();
        mySender.send("Hello 2");
    }
}
