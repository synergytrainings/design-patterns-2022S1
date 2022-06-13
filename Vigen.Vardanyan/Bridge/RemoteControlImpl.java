package Bridge;

public class RemoteControlImpl implements RemoteControl {
    private Device device;

    public RemoteControlImpl(Device device) {
        this.device = device;
    }

    @Override
    public void mute() {
        device.setVolume(0);
        System.out.println("Mute device volume");
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println("Device disabled");
        } else {
            device.enable();
            System.out.println("Device enabled");
        }
    }

    @Override
    public void volumeUp(int volume) {
        device.setVolume(device.getVolume() + volume);
        System.out.println("Change device volume up to " + device.getVolume());
    }

    @Override
    public void volumeDown(int volume) {
        device.setVolume(device.getVolume() - volume);
        System.out.println("Change device volume down to " + device.getVolume());
    }
}
