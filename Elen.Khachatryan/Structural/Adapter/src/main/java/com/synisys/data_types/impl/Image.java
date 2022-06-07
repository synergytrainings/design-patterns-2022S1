package com.synisys.data_types.impl;

import com.synisys.data_types.Data;
import com.synisys.enums.ComputerOperationSystems;

public class Image extends DataAbstract implements Data {
    public Image(String name, double size, ComputerOperationSystems os, String extension, String... path) {
        super(name, size, os, extension, path);
    }
}
