package examples;

public class JobManager {
    private final Notifier notifier;

    public JobManager(Notifier notifier){
        this.notifier = notifier;
    }

    public void runJob(){
        notifier.send("Job filed!", "admin");
    }
}
