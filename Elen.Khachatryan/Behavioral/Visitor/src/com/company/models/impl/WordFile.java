package com.company.models.impl;

import com.company.visitor.api.Visitor;

public class WordFile extends AbstractFile {

    public WordFile(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
