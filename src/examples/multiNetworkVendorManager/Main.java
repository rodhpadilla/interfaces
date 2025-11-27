package examples.multiNetworkVendorManager;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CiscoRouter ciscoRouter = new CiscoRouter();
        ArrayList<String> ciscoCommands = new ArrayList<>(Arrays.asList("show version", "reboot"));
        NetworkManagementService networkManagementService = new NetworkManagementService(ciscoRouter);
        networkManagementService.performMaintenance("192.168.1.254", ciscoCommands);

        JuniperRouter juniperRouter = new JuniperRouter();
        ArrayList<String> juniperCommands = new ArrayList<>(Arrays.asList("show version", "request system reboot"));
        NetworkManagementService networkManagementService2 = new NetworkManagementService(juniperRouter);
        networkManagementService2.performMaintenance("172.16.1.254", juniperCommands);
    }
}
