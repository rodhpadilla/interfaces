package examples.multiNetworkVendorManager;

public class JuniperRouter implements RouterDevice {

    @Override public void connect(final String ipAddress) {
        System.out.println("[Juniper] Connecting to " + ipAddress + " via NETCONF..");
    }

    @Override public void sendCommand(final String command) {
        System.out.println("[Juniper Junos] Executing: <" + command + ">");
    }

    @Override public void disconnect() {
        System.out.println("[Juniper] Session ended.");
    }
}
