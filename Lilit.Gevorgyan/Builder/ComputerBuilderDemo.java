package Builder;
import Builder.Computer;

class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("512GB", "16GB")
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.getSSD());
        System.out.println(computer.getRAM());
        System.out.println(computer.isGraphicsCardEnabled());
        System.out.println(computer.isBluetoothEnabled());
    }
}
