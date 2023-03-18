package Prototype;

public class Demo {

    public static void main(String[] args) {
        Form form1 = new MainForm(1, "Main Form");
        System.out.println("MainForm title is " + form1.getTitle() + " and id=" + form1.getId());

        Form form2 = form1.clone();
        System.out.println("MainForm title is " + form2.getTitle() + " and id=" + form2.getId());

        Form form3 = new SubForm(1, form1.getId(), "Sub Form");
        System.out.println("SubForm title is " + form3.getTitle() + " and id=" + form3.getId());

        Form form4 = form3.clone();
        System.out.println("SubForm title is " + form4.getTitle() + " and id=" + form4.getId());
    }
}
