package com.company.models.api;

import com.company.models.Cursor;
import com.company.visitor.api.Visitor;

public interface File {
    void write(Cursor cursor, String text);

    void preview();

    void delete(Cursor cursor, int elementsToDelete);
}

