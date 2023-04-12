package com.company;

import com.company.models.Cursor;
import com.company.models.api.File;
import com.company.models.impl.DocFile;

public class Demo {
    public static void main(String[] args) {
        File docFile = new DocFile("test.docx");
        docFile.write(Cursor.of(1, 1), "Data");
        docFile.write(Cursor.of(1, 2), "Some Other Text");
        docFile.preview();
    }
}
