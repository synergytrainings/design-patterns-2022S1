package com.synisys;

import com.synisys.enums.Status;
import com.synisys.enums.Type;
import com.synisys.exceptions.TechnicalIssueException;
import com.synisys.printer.Printer;
import com.synisys.service.PrinterManagementSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            PrinterManagementSystem manager = PrinterManagementSystem.getPrinterManagementSystemInstance();
            manager.addPrinter(new Printer(100, 20, Status.AVAILABLE, 50, Type.BLACK_AND_WHITE));
            manager.addPrinter(new Printer(120, 30, Status.BUSY, 40, Type.BLACK_AND_WHITE));
            manager.addPrinter(new Printer(50, 20, Status.SWITCHED_OFF, 50, Type.COLOR));
            manager.addPrinter(new Printer(120, 30, Status.AVAILABLE, 50, Type.BLACK_AND_WHITE));
            manager.addPrinter(new Printer(120, 30, Status.AVAILABLE, 50, Type.BLACK_AND_WHITE));
            manager.addPrinter(new Printer(120, 30, Status.AVAILABLE, 50, Type.BLACK_AND_WHITE));

            Thread thread1 = new Thread(() -> {
                try {
                    manager.print(Arrays.asList(10, 15, 10, 15, 10, 15, 10, 15, 10, 15));
                } catch (TechnicalIssueException e) {
                    System.out.println("Error");
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(manager.getAllAvailablePrinters());
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    manager.print(Arrays.asList(79, 7987, 79, 7987, 79, 7987, 79, 7987));
                } catch (TechnicalIssueException e) {
                    System.out.println("Error");
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(manager.getAllAvailablePrinters());
                }
            });
            thread1.start();
            thread2.start();

            manager.print(Arrays.asList(50, 787));
        } catch (TechnicalIssueException e) {
            System.out.println(e.getMessage());
        }

    }
}

