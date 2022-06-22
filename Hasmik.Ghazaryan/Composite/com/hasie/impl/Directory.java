package com.hasie.impl;

import com.hasie.helper.Indentation;
import com.hasie.api.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {
    private String name;
    private List<AbstractFile> files = new ArrayList<>();
    private Indentation indentation;
    public Directory (String name, Indentation indentation) {
        this.name = name;
        this.indentation = indentation;
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    public void ls() {
        System.out.println(indentation.getIndentation() + name);
        indentation.increaseIndentation();
        files.forEach(AbstractFile::ls);
        indentation.decreaseIndentation();
    }
}
