package Prototype;

public class Main {

    public static void main(String[] args) {
        StackOverflowCode initialCode = new StackOverflowCode("https://stackoverflow.com/questions/2281087/center-a-div-in-css");
        StackOverflowCode copyInitialCode = (StackOverflowCode) initialCode.clone();
        System.out.println(initialCode.equals(copyInitialCode));
    }
}
