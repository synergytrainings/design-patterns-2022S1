package com.company.visitor.api;

import com.company.models.impl.DocFile;
import com.company.models.impl.PDFFile;
import com.company.models.impl.WordFile;

public interface Visitor {
    public void visit(PDFFile file);

    public void visit(DocFile file);

    public void visit(WordFile file);
}
