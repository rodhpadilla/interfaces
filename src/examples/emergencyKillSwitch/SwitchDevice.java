package examples.emergencyKillSwitch;

public interface SwitchDevice {
    default boolean connect(Switch switchData) {
        System.out.println("[" + switchData.getBrand() + "] - Initiate SSH connection to " + switchData.getIp());
        System.out.println("[" + switchData.getBrand() + "] - Connected to " + switchData.getIp());
        return true;
    };

    boolean sendCommands(Switch switchData);

    default boolean disconnect(Switch switchData) {
        System.out.println("[" + switchData.getBrand() + "] - Closing SSH connection from " + switchData.getIp());
        System.out.println("[" + switchData.getBrand() + "] - Disconnected from " + switchData.getIp());
        return true;
    };
}
