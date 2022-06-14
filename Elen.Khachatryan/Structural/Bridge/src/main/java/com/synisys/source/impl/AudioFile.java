package com.synisys.source.impl;

import com.synisys.source.Extension;
import com.synisys.source.api.AbstractFile;

public class AudioFile extends AbstractFile {

    public AudioFile(String name, String description, int durationInSeconds, Extension extension) {
        super(name, description, durationInSeconds, extension);
    }
}
