package Builder;

public class Computer {

    //required parameters
    private String SSD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getSSD() {
        return SSD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.SSD=builder.SSD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    //Builder Class
    public static class ComputerBuilder{

        // required parameters
        private String SSD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String ssd, String ram){
            this.SSD=ssd;
            this.RAM=ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
