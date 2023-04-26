package com.company.visitor.impl;

import com.company.models.impl.DocFile;
import com.company.models.impl.PDFFile;
import com.company.models.impl.WordFile;
import com.company.visitor.api.Visitor;

public class FilePreviewVisitor implements Visitor {

    private static class Loader {
        static final FilePreviewVisitor FILE_PREVIEW_VISITOR_INSTANCE = new FilePreviewVisitor();
    }
    private FilePreviewVisitor() {}

    public static FilePreviewVisitor getFlePreviewVisitorInstance() {
        return Loader.FILE_PREVIEW_VISITOR_INSTANCE;
    }

    @Override
    public void visit(PDFFile file) {
        file.setPreviewWidth(100);
        file.setPreviewHeight(150);
        file.setPreviewFontSize(12);
    }

    @Override
    public void visit(DocFile file) {
        file.setPreviewWidth(140);
        file.setPreviewHeight(200);
        file.setPreviewFontSize(12);
    }

    @Override
    public void visit(WordFile file) {
        file.setPreviewWidth(150);
        file.setPreviewHeight(150);
        file.setPreviewFontSize(13);
    }
}
