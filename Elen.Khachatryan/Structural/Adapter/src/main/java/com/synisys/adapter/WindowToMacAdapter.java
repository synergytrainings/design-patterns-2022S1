package com.synisys.adapter;

import com.synisys.api.MacInterface;
import com.synisys.data_types.Data;
import com.synisys.enums.DataType;
import com.synisys.impl.Windows;

public class WindowToMacAdapter implements MacInterface {

    private Windows windows;

    public WindowToMacAdapter(Windows windows) {
        this.windows = windows;
    }

    @Override
    public String readData(String name, DataType type, String... path) {
        return this.windows.readData(name, type, path);
    }

    @Override
    public void writeData(Data file, String data) {
        this.windows.writeData(file, data);
    }

    @Override
    public Data getFile(String name, DataType type, String... path) {
        return this.windows.getFile(name, type, path);
    }

    @Override
    public void createLibreOfficeDocument(String fileName) {
        System.out.println("Creating Libre Adapter file");
        this.windows.createWordDocument(fileName);
    }

    @Override
    public void openSafariBrowser() {
        System.out.println("Opening Windows's Main Browser");
        this.windows.openMicrosoftEdgeBrowser();
    }
}
