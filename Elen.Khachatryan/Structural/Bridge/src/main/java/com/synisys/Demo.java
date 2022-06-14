package com.synisys;

import com.synisys.editor.api.Editor;
import com.synisys.editor.impl.DesktopEditor;
import com.synisys.source.Extension;
import com.synisys.source.api.File;
import com.synisys.source.impl.VideoFile;
import com.synisys.view.api.View;
import com.synisys.view.impl.SimpleView;

public class Demo {
    public static void main(String[] args) {
        File source = new VideoFile("test", "This is just a Test", 150, Extension.MP4);
        View simpleView = new SimpleView(source);
        Editor deskEditor = new DesktopEditor(simpleView);
        deskEditor.playPreview();
    }
}
