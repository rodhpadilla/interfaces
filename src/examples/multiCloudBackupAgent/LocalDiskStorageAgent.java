package examples.multiCloudBackupAgent;

public class LocalDiskStorageAgent implements BackupAgent {
    @Override public void save(final ConfigurationFile fileDetails) {
        System.out.println("Initializing [LOCAL] agent to save data...]");
        System.out.println("Name of the file: " + fileDetails.getFileName());
        System.out.println("Content: " + fileDetails.getContent());
        System.out.println("Saving data in /var/backups");
        System.out.println("Closing agent");
    }
}
