package Adapter;

import java.util.ArrayList;

public class Adapter {
    public static void main(String[] args) {
        PC pc1 = new PC();
        NewDellMonitor dellNew = new NewDellMonitor(); //  this can be declared as NewMonitor dellNew
        NewPhilipsMonitor philipsNew = new NewPhilipsMonitor(); // this can be declared as NewMonitor philipsNew
        OldMonitor dellOld = new OldMonitor();
        VGAAdapter vgaAdapter = new VGAAdapter(dellOld); // this can be declared as NewMonitor vgaAdapter
        pc1.connectMonitor(dellNew);
        pc1.connectMonitor(philipsNew);
        pc1.connectMonitor(vgaAdapter);
        System.out.println(pc1.monitors.size());
    }
}

class VGAAdapter implements NewMonitor{
    OldMonitor oldMonitor;
    public VGAAdapter(OldMonitor oldMonitor){
        this.oldMonitor = oldMonitor;
    }
    @Override
    public void connectHDMI() {
        this.oldMonitor.connectVGA();
    }

}

interface NewMonitor {
    void connectHDMI();
}

class PC {
    ArrayList<NewMonitor> monitors;

    public PC() {
        monitors = new ArrayList<NewMonitor>();
    }

    public void connectMonitor(NewMonitor monitor) {
        monitor.connectHDMI();
        monitors.add(monitor);
    }
}

class NewDellMonitor implements NewMonitor {

    public void connectHDMI() {
        System.out.println("HDMI Connected to new Dell");
    }
}

class NewPhilipsMonitor implements NewMonitor {
    public void connectHDMI() {
        System.out.println("HDMI Connected to new Philips");
    }
}

class OldMonitor {
    public void connectVGA() {
        System.out.println("VGA Connected to old monitor");
    }
}
