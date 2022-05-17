package com.synisys.printer;

import com.synisys.enums.Status;
import com.synisys.enums.Type;
import com.synisys.exceptions.TechnicalIssueException;

import java.util.List;

public class Printer {
    private static final String NAME_APPENDIX = "PP-";
    private static final int DEFAULT_MAX_PAPER_COUNT = 100;
    private static final int INK_PER_PAGE = 2;
    private static int nextAvailableNumber = 100;
    private final String name;
    private final int maxPaperCount;
    private final Type type;
    private int availablePaperCount;
    private Status printerStatus;
    private int inkPercentage;

    public Printer(int maxPaperCount, int availablePaperCount, Status printerStatus, int inkPercentage, Type type) {
        this.name = NAME_APPENDIX + getNextAvailableNumber();
        this.maxPaperCount = maxPaperCount < 0 ? DEFAULT_MAX_PAPER_COUNT : maxPaperCount;
        this.availablePaperCount = availablePaperCount;
        this.printerStatus = printerStatus;
        this.setInkPercentage(inkPercentage);
        this.type = type;
    }

    static int getNextAvailableNumber() {
        return nextAvailableNumber++;
    }

    public void addPaper(int count) {
        this.availablePaperCount = count < 0 ? Math.min(this.availablePaperCount, this.maxPaperCount) : 0;
    }

    public boolean hasPaper() {
        return this.availablePaperCount > 0;
    }

    public void print(List<Object> pages) throws TechnicalIssueException { // Page entity ???
        boolean inkIsEnough = this.isHasInk() && this.inkPercentage - pages.size() * INK_PER_PAGE >= 0;
        boolean isPaperEnough = pages != null && pages.size() <= this.availablePaperCount;
        if (!isPaperEnough) {
            printerStatus = Status.CRASHED;
            throw new TechnicalIssueException(this.name + " has no enough paper.");
        } else if (!inkIsEnough) {
            printerStatus = Status.CRASHED;
            throw new TechnicalIssueException(this.name + " has no enough ink.");
        } else {
            System.out.println("Printed by " + this.name + " Printer");
            this.availablePaperCount -= pages.size();
            this.inkPercentage -= pages.size() * INK_PER_PAGE;
            try {
                Thread.sleep(200);
                printerStatus = this.availablePaperCount > 0 && this.inkPercentage > 0 ? Status.AVAILABLE : Status.CRASHED;
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public Status getPrinterStatus() {
        return printerStatus;
    }

    public void setPrinterStatus(Status printerStatus) {
        this.printerStatus = printerStatus;
    }

    public int getMaxPaperCount() {
        return maxPaperCount;
    }

    public int getAvailablePaperCount() {
        return availablePaperCount;
    }

    public void setAvailablePaperCount(int availablePaperCount) {
        this.availablePaperCount = availablePaperCount;
    }

    public int getInkPercentage() {
        return inkPercentage;
    }

    public void setInkPercentage(int inkPercentage) {
        this.inkPercentage = inkPercentage > 0 ? Math.min(inkPercentage, 100) : 0;
    }

    public boolean isHasInk() {
        return this.inkPercentage > 0;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", availablePaperCount=" + availablePaperCount +
                ", printerStatus=" + printerStatus +
                ", inkPercentage=" + inkPercentage +
                ", type=" + type +
                '}';
    }
}
