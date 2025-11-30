package examples.multiCloudBackupAgent;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LocalDiskStorageAgentTest {

    @Test
    public void testSaveReturnsTrueOnSuccess() {
        LocalDiskStorageAgent agent = new LocalDiskStorageAgent();
        ConfigurationFile file = new ConfigurationFile();
        file.setFileName("nginx.conf");
        file.setContent("blah blah");

        boolean isSuccess = agent.save(file);
        assertTrue(isSuccess);
    }
}
