package com.synisys.models;

import com.synisys.enums.ChangeType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Change {
    private File changedFile;
    private ChangeType changeType;
    private List<Line> changedLines;

    public Change(File changedFile, ChangeType changeType, List<Line> changedLines) {
        this.changedFile = changedFile;
        this.changeType = changeType;
        this.changedLines = changedLines;
    }

    public Change(File changedFile, ChangeType changeType) {
        this(changedFile, changeType, new ArrayList<>());
    }

    public File getChangedFile() {
        return changedFile;
    }

    public void setChangedFile(File changedFile) {
        this.changedFile = changedFile;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeType changeType) {
        this.changeType = changeType;
    }

    public List<Line> getChangedLines() {
        return changedLines;
    }

    public void setChangedLines(List<Line> changedLines) {
        this.changedLines = changedLines;
    }
}
