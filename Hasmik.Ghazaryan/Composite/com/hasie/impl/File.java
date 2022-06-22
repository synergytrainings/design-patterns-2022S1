package com.hasie.impl;

import com.hasie.helper.Indentation;
import com.hasie.api.AbstractFile;

public class File implements AbstractFile {
    private String name;
    private Indentation indentation;
    public File(String name, Indentation indentation) {
        this.name = name;
        this.indentation = indentation;
    }
    public void ls() {
        System.out.println(indentation.getIndentation() + name);
    }

}
