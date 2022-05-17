package Singleton;

class ConfigManagerWithDoubleCheckedLockingDemo {
    public static void main(String[] args) {
        ConfigManagerWithDoubleCheckedLocking config = ConfigManagerWithDoubleCheckedLocking.getInstance();

        config.update("migrationUserName", "migrationAdmin");

        ConfigManagerWithDoubleCheckedLocking anotherConfig = ConfigManagerWithDoubleCheckedLocking.getInstance();

        System.out.println(anotherConfig.get("migrationUserName"));

        anotherConfig.update("migrationPassword", "migrationPa$$w0rD");

        System.out.println(config.get("migrationPassword"));
    }
}
