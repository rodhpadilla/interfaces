package examples.emergencyKillSwitch;

public class SwitchDeviceManager {
    private final SwitchDevice switchDevice;

    public SwitchDeviceManager(final SwitchDevice switchDevice) {
        this.switchDevice = switchDevice;
    }

    public boolean executeTask(Switch switchData) {
        boolean switchDeviceConnect = switchDevice.connect(switchData);
        if (switchDeviceConnect) {
            boolean switchDeviceSendCommands = switchDevice.sendCommands(switchData);
            boolean switchDeviceSendDisconnects = switchDevice.disconnect(switchData);
            return switchDeviceSendCommands && switchDeviceSendDisconnects;
        }
        return false;
    }
}
