package examples;

public class SlackNotifier implements Notifier{
    @Override
    public void send(String message, String recipient){
        System.out.println("Posting to slack channel @" + recipient + ": " + message);
    }
}
