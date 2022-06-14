package com.synisys.editor.impl;

import com.synisys.editor.api.AbstractEditor;
import com.synisys.editor.api.Editor;
import com.synisys.view.api.View;

public class MobileEditor extends AbstractEditor implements Editor {
    private static final double MOBILE_DEFAULT_HEIGHT = 640;
    private static final double MOBILE_DEFAULT_WIDTH = 360;

    public MobileEditor(View view) {
        super(view);
        this.getView().updateSize(MOBILE_DEFAULT_HEIGHT, MOBILE_DEFAULT_WIDTH);
    }

    @Override
    public void playPreview() {
        System.out.println("Play Preview on mobile ...");
        this.getView().showPreview();
    }

    @Override
    public void cut(int start, int end) {
        checkingArguments(start, end);
        // cut source
    }
}
