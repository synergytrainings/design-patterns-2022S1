package Facade;

public class Surgeon {

    public void replaceOldKidney(Patient patient, Side kidneyType) {
        System.out.printf("Making incision for %s's %s kidney...\n...%n", patient.name,
                kidneyType == Side.LEFT ? "left" : "right");
        System.out.println("Replacing kidney...\n...");
        System.out.println("The new kidney is placed and all essential parts are attached carefully...\n...");
        System.out.println("The ureter is attached to the bladder...\n...");
        System.out.println("A small drain is inserted into the abdomen to drain excess fluid...\n...");
        System.out.println("Patient is sewn back up and monitored closely...\n...");
    }


}
