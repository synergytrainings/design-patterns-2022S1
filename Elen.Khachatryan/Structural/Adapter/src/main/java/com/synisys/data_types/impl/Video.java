package com.synisys.data_types.impl;

import com.synisys.enums.ComputerOperationSystems;

public class Video extends DataAbstract {
    public Video(String name, double size, ComputerOperationSystems os, String extension, String... path) {
        super(name, size, os, extension, path);
    }
}
