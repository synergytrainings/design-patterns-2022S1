package com.hasie.helper;

public class Indentation {

    private StringBuilder indent = new StringBuilder();

    public String getIndentation() {
        return indent.toString();
    }

    public void increaseIndentation() {
        indent.append("   ");
    }

    public void decreaseIndentation() {
        if (indent.length() >= 3) {
            indent.setLength(indent.length() - 3);
        }
    }
}
