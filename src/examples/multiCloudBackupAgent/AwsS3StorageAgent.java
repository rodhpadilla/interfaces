package examples.multiCloudBackupAgent;

public class AwsS3StorageAgent implements BackupAgent {
    @Override public boolean save(final ConfigurationFile fileDetails) {
        System.out.println("Initializing [AWS] agent to save data...]");
        System.out.println("Name of the file: " + fileDetails.getFileName());
        System.out.println("Content: " + fileDetails.getContent());
        System.out.println("Saving data in S3 bucket");
        System.out.println("Closing agent");
        return true;
    }
}
