package com.company.models.impl;

import com.company.visitor.api.Visitor;

public class PDFFile extends AbstractFile {

    public PDFFile(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
