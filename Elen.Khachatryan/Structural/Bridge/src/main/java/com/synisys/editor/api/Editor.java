package com.synisys.editor.api;

import com.synisys.source.api.File;

public interface Editor {
    // view
    void playPreview();
    // edit
    void cut(int start, int end); // cut seconds
    void updateEditorSize(double height, double width);
    void save();
}
