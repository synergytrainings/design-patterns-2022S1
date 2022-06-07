package com.synisys.data_types.impl;

import com.synisys.data_types.Data;
import com.synisys.enums.ComputerOperationSystems;

public class Text extends DataAbstract implements Data {
    public Text(String name, double size, ComputerOperationSystems os, String extension, String... path) {
        super(name, size, os, extension, path);
    }
}
