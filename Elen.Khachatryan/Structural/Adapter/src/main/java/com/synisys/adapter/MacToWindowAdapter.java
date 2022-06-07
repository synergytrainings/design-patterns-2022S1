package com.synisys.adapter;

import com.synisys.api.WindowsInterface;
import com.synisys.data_types.Data;
import com.synisys.enums.DataType;
import com.synisys.impl.Mac;

public class MacToWindowAdapter implements WindowsInterface {
    private Mac mac; // adaptee

    public MacToWindowAdapter(Mac mac) {
        this.mac = mac;
    }

    @Override
    public void createWordDocument(String fileName) {
        System.out.println("Creating Mac's Word Adapter file");
        this.mac.createLibreOfficeDocument(fileName);
    }

    @Override
    public void openMicrosoftEdgeBrowser() {
        System.out.println("Opening Mac's Main Browser");
        this.mac.openSafariBrowser();
    }

    @Override
    public String readData(String name, DataType type, String... path) {
        return this.mac.readData(name,type,path);
    }

    @Override
    public void writeData(Data file, String data) {
        this.mac.writeData(file,data);
    }

    @Override
    public Data getFile(String name, DataType type, String... path) {
        return this.mac.getFile(name,type,path);
    }
}
