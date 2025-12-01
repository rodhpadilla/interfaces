package examples.emergencyKillSwitch;

public class Main {
    public static void main(String[] args) {

        // Cisco SW
        Switch ciscoSW = new Switch();
        ciscoSW.setIp("192.168.1.50");
        ciscoSW.setPortName("Gi0/1");
        ciscoSW.setBrand("CiscoIOS");

        // Juniper Junos
        Switch juniperSW = new Switch();
        juniperSW.setIp("10.0.0.5");
        juniperSW.setPortName("ge-0/0/1");
        juniperSW.setBrand("JuniperJunos");

        CiscoIOSSwitch iosSwitch = new CiscoIOSSwitch();
        SwitchDeviceManager switchDeviceManager = new SwitchDeviceManager(iosSwitch);
        switchDeviceManager.executeTask(ciscoSW);

        JuniperJunosSwitch junosSwitch = new JuniperJunosSwitch();
        SwitchDeviceManager switchDeviceManager1 = new SwitchDeviceManager(junosSwitch);
        switchDeviceManager1.executeTask(juniperSW);

    }
}
