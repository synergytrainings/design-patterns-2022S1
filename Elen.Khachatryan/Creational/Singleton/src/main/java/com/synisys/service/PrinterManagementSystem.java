package com.synisys.service;

import com.synisys.enums.Status;
import com.synisys.exceptions.TechnicalIssueException;
import com.synisys.printer.Printer;

import java.util.*;
import java.util.stream.Collectors;

public class PrinterManagementSystem {

    private static volatile PrinterManagementSystem loaderInstance;
    private final Map<String, Printer> printers;

    private PrinterManagementSystem() {
        this.printers = new HashMap<>();
    }

    public static PrinterManagementSystem getPrinterManagementSystemInstance() {
        if (loaderInstance == null) {
            synchronized (PrinterManagementSystem.class) {
                if (loaderInstance == null) {
                    loaderInstance = new PrinterManagementSystem();
                }
            }
        }
        return loaderInstance;
    }

    public void addPrinter(Printer printer) {
        this.printers.put(printer.getName(), printer);
    }

    public void print(List<Object> pages) throws TechnicalIssueException {
        List<Printer> availablePrinters = this.getAllAvailablePrinters();
        Printer availablePrinter = availablePrinters.get((int) (Math.random() * availablePrinters.size()));
        if (availablePrinter != null && availablePrinter.getPrinterStatus() == Status.AVAILABLE) {
            synchronized (printers.get(availablePrinter.getName())) {
                try {
                    if (availablePrinter.getPrinterStatus() == Status.AVAILABLE) {
                        availablePrinter.setPrinterStatus(Status.BUSY);
                        Thread.sleep(100);
                        availablePrinter.print(pages);
                        return;
                    }
                }
                 catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new TechnicalIssueException("No available printer");
    }

    public List<Printer> getAllAvailablePrinters() {
        return printers.values().stream().filter(printer -> printer.getPrinterStatus() == Status.AVAILABLE).collect(Collectors.toList());
    }

    public Collection<Printer> getPrinters() {
        return printers.values();
    }

}
