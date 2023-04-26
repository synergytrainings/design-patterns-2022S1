package com.company.models.impl;

import com.company.models.Cursor;
import com.company.models.api.File;
import com.company.visitor.api.Visitor;
import com.company.visitor.impl.FilePreviewVisitor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public abstract class AbstractFile implements File {

    public static final int LINES_PER_PAGE = 30;
    public static final int SYMBOL_PER_LINE = 120;
    private int numberOfLines;
    private String name;
    private String text;

    private int previewWidth;
    private int previewHeight;
    private int previewFontSize;

    public AbstractFile(String name) {
        this.name = name;
        this.text = "";
    }

    @Override
    public void write(Cursor cursor, String text) {
        int cursorLocation = cursor.getLine() * cursor.getColumn();
        assert cursorLocation < this.text.length();
        this.text = String.format("%s%s%s", this.text.substring(0, cursorLocation - 1), text, this.text.substring(cursorLocation - 1));
        this.numberOfLines += text.length() / SYMBOL_PER_LINE;
    }

    @Override
    public void delete(Cursor cursor, int elementsToDelete) {
        int cursorLocation = cursor.getLine() * cursor.getColumn();
        assert this.text.length() - cursorLocation - elementsToDelete > 0;
        this.text = this.text.substring(0, cursorLocation - 1) + this.text.substring(cursorLocation -1 + elementsToDelete);
        this.numberOfLines -= elementsToDelete / SYMBOL_PER_LINE;
    }

    @Override
    public void preview() {
        this.accept(FilePreviewVisitor.getFlePreviewVisitorInstance());
        JFrame frame = new JFrame(this.name);
        JFormattedTextField textField = new JFormattedTextField(this.text);
        frame.add(textField);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(this.previewWidth, this.previewHeight));
        frame.setVisible(true);
    }

    abstract void accept(Visitor visitor);

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(int previewWidth) {
        this.previewWidth = previewWidth;
    }

    public int getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(int previewHeight) {
        this.previewHeight = previewHeight;
    }

    public int getPreviewFontSize() {
        return previewFontSize;
    }

    public void setPreviewFontSize(int previewFontSize) {
        this.previewFontSize = previewFontSize;
    }
}
