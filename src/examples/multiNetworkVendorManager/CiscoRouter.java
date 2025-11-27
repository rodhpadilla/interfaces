package examples.multiNetworkVendorManager;

public class CiscoRouter implements RouterDevice {
    @Override public void connect(String ipAddress) {
        System.out.println("[Cisco] Connecting to " + ipAddress + " via SSH..");
    }

    @Override public void sendCommand(final String command) {
        System.out.println("[Cisco-IOS] Executing: <" + command + ">");
    }

    @Override public void disconnect() {
        System.out.println("[Cisco] Session ended.");
    }
}
