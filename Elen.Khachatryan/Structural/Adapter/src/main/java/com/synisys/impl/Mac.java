package com.synisys.impl;

import com.synisys.api.MacInterface;
import com.synisys.data_types.Data;
import com.synisys.data_types.impl.Image;
import com.synisys.data_types.impl.Text;
import com.synisys.data_types.impl.Video;
import com.synisys.enums.ComputerOperationSystems;
import com.synisys.enums.DataType;

import java.util.Objects;

public class Mac implements MacInterface {
    @Override
    public void writeData(Data file, String data) {
        file.write(data);
    }

    @Override
    public String readData(String name, DataType type, String... path) {
        return this.getFile(name, type, path).read();
    }

    @Override
    public Data getFile(String name, DataType type,String... path) {
        switch (type) {
            case TEXT: {
                return new Text(name, 0, ComputerOperationSystems.WINDOWS, "", path);
            }
            case IMAGE: {
                return new Image(name, 0, ComputerOperationSystems.WINDOWS, "", path);
            }
            case VIDEO: {
                return new Video(name, 0, ComputerOperationSystems.WINDOWS, "", path);
            }
            default: {
                throw new IllegalArgumentException(String.format("%s is not supported", type));
            }
        }
    }

    @Override
    public void createLibreOfficeDocument(String fileName) {
        System.out.println(String.format("Creating Libre Office document %s", fileName));
    }

    @Override
    public void openSafariBrowser() {
        System.out.println("Opening Safari Browser");
    }
}
