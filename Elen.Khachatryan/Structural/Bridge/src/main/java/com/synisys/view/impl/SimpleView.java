package com.synisys.view.impl;

import com.synisys.source.api.File;
import com.synisys.view.api.AbstractView;
import com.synisys.view.api.View;

public class SimpleView extends AbstractView implements View {
    public SimpleView(File source) {
        super(source);
    }

    @Override
    public void showDetails() {
        this.setDescription("");
    }

    @Override
    public void hideDetails() {
        this.setDescription("");
    }


    @Override
    public void showPreview() {

    }
}
