package examples;

public class SmsSender implements MessageSender{
    @Override
    public void send(String txt){
        System.out.println("Sending SMS via Slack: " + txt);
    }
}
