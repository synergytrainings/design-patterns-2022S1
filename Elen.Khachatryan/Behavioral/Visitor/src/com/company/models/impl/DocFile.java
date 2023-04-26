package com.company.models.impl;

import com.company.visitor.api.Visitor;

public class DocFile extends AbstractFile {

    public DocFile(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
