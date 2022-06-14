package com.synisys.source.impl;

import com.synisys.source.Extension;
import com.synisys.source.api.AbstractFile;
import com.synisys.source.api.File;

public class VideoFile extends AbstractFile implements File {

    public VideoFile(String name, String description, int durationInSeconds, Extension extension) {
        super(name, description, durationInSeconds, extension);
    }

}
