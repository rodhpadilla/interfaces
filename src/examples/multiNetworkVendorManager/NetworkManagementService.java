package examples.multiNetworkVendorManager;

import java.util.ArrayList;

public class NetworkManagementService {
    private final RouterDevice router;

    public NetworkManagementService(final RouterDevice router) {
        this.router = router;
    }

    public void performMaintenance(String ip, ArrayList<String> commands){
        router.connect(ip);
        if (!commands.isEmpty()) {
            for (String command : commands) {
                router.sendCommand(command);
            }
        }
        router.disconnect();
    }

}
