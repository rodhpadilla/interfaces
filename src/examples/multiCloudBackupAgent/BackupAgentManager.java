package examples.multiCloudBackupAgent;

public class BackupAgentManager {
    private final BackupAgent backupAgent;

    public BackupAgentManager(final BackupAgent backupAgent) {
        this.backupAgent = backupAgent;
    }

    public void performBackup(ConfigurationFile configurationFile) {
        backupAgent.save(configurationFile);
    }
}
