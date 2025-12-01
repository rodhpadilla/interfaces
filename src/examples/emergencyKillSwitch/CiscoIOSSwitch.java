package examples.emergencyKillSwitch;

public class CiscoIOSSwitch implements SwitchDevice {

    @Override public boolean sendCommands(Switch switchData) {
        System.out.println("Commands to send:");
        System.out.println("interface " + switchData.getPortName());
        System.out.println("shutdown");
        return true;
    }
}
