package examples.emergencyKillSwitch;

public class JuniperJunosSwitch implements SwitchDevice {

    @Override public boolean sendCommands(Switch switchData) {
        System.out.println("Commands to send:");
        System.out.println("set interface " + switchData.getPortName() + " disable");
        return true;
    }
}
