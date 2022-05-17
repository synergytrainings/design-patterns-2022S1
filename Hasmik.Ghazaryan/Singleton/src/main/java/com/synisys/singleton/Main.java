package main.java.com.synisys.singleton;

public class Main {

    private static final String ENVIRONMENT = "development";
    private static final String SOURCE = "vault";

    public static void main(String[] args) {

        ConfigurationManager manager = ConfigurationManager.getInstance(SOURCE, ENVIRONMENT);
        manager.configure("validationservice", "k8s-dev.synisys.com/validationservice/v1");
        System.out.println(manager.readConfig("deservice"));
        System.out.println(manager.readConfig("validationservice"));

    }
}
