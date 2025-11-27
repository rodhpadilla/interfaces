package examples.multiNetworkVendorManager;

public interface RouterDevice {
    void connect(String ipAddress);

    void sendCommand(String command);

    void disconnect();
}
