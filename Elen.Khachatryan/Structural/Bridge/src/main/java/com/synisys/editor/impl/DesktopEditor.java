package com.synisys.editor.impl;

import com.synisys.editor.api.AbstractEditor;
import com.synisys.view.api.View;

public class DesktopEditor extends AbstractEditor {
    private static final double DESKTOP_DEFAULT_HEIGHT = 1080;
    private static final double DESKTOP_DEFAULT_WIDTH = 1920;

    public DesktopEditor(View view) {
        super(view);
        view.updateSize(DESKTOP_DEFAULT_HEIGHT, DESKTOP_DEFAULT_WIDTH);
    }

    @Override
    public void playPreview() {
        System.out.println("Play Preview on desktop ...");
        this.getView().showPreview();
    }

    @Override
    public void cut(int start, int end) {
        checkingArguments(start, end);
        // cut source
    }
}
