package examples;

public class EmailSender implements MessageSender{
    @Override
    public void send(String txt){
        System.out.println("Connecting to SMTP server... Email sent: " + txt);
    }
}
