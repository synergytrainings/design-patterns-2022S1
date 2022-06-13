package Bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        RemoteControl remoteTV = new RemoteControlImpl(new TV());
        remoteTV.power();
        remoteTV.volumeUp(15);
        remoteTV.mute();

        RemoteControl remote = new RemoteControlImpl(new MusicCenter());
        remote.power();
        remote.volumeUp(80);
        remote.volumeDown(65);
        remote.power();
    }
}
