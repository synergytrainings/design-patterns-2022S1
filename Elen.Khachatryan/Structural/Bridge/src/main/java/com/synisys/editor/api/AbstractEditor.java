package com.synisys.editor.api;

import com.synisys.source.api.File;
import com.synisys.view.api.View;

public abstract class AbstractEditor implements Editor{
    private AudioDriver audioDriver;
    private VideoDriver videoDriver;
    private View view;
    private int stoppedSecond;

    public AbstractEditor(View view) {
        this.audioDriver = new AudioDriver();
        this.videoDriver = new VideoDriver();
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public int getStoppedSecond() {
        return stoppedSecond;
    }

    public void setStoppedSecond(int stoppedSecond) {
        this.stoppedSecond = stoppedSecond;
    }

    @Override
    public void updateEditorSize(double height, double width) {
        this.getView().updateSize(height, width);
    }

    protected void checkingArguments(int start, int end) {
        if (start < 0) {
            throw new IllegalArgumentException("Start must be >= 0");
        }
        if (end < 0) {
            throw new IllegalArgumentException("End must be >= 0");
        }
        if (start > end) {
            throw new IllegalArgumentException("Start must be <= to end");
        }
    }

    @Override
    public void save() {
        // saving changes
    }
}

class AudioDriver {
    public void playAudio(File file) {
        // plays file
    }
}

class VideoDriver {
    void playVideo(File file) {

    }
}

