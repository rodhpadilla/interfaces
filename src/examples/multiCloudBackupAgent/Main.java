package examples.multiCloudBackupAgent;

public class Main {
    public static void main(String[] args) {
        ConfigurationFile myImportantFile = new ConfigurationFile();
        myImportantFile.setFileName("nginx.conf");
        myImportantFile.setContent("blah blah");

        // Local
        LocalDiskStorageAgent localDiskStorageAgent = new LocalDiskStorageAgent();
        BackupAgentManager backupAgentManager = new BackupAgentManager(localDiskStorageAgent);
        backupAgentManager.performBackup(myImportantFile);

        // AWS
        AwsS3StorageAgent awsS3StorageAgent = new AwsS3StorageAgent();
        BackupAgentManager backupAgentManager1 = new BackupAgentManager(awsS3StorageAgent);
        backupAgentManager1.performBackup(myImportantFile);
    }
}
