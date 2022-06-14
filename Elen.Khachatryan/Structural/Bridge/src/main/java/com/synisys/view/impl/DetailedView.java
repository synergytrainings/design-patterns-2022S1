package com.synisys.view.impl;

import com.synisys.source.api.File;
import com.synisys.view.api.AbstractView;
import com.synisys.view.api.View;

public class DetailedView extends AbstractView implements View {
    public DetailedView(File source) {
        super(source);
    }

    @Override
    public void showDetails() {
        this.setDescription(this.getSource().getDescription());
    }

    @Override
    public void hideDetails() {
        this.setDescription("");
    }

    @Override
    public void showPreview() {
        // show detailed preview
    }
}
