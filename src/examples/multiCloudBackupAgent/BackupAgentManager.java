package examples.multiCloudBackupAgent;

public class BackupAgentManager {
    private final BackupAgent backupAgent;

    public BackupAgentManager(final BackupAgent backupAgent) {
        this.backupAgent = backupAgent;
    }

    public boolean performBackup(ConfigurationFile configurationFile) {
        boolean backupResult = backupAgent.save(configurationFile);
        int counter = 3;
        while (!backupResult){
            System.out.println("Backup failed. Retrying... (" + counter + " attempts left)");
            backupResult = backupAgent.save(configurationFile);
            counter -=1;
            if (counter == 0) {
                System.out.println("Giving up after multiple attempts.");
                break;
            }
        }
        return backupResult;
    }
}
