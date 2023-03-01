package com.synisys.services.impl;

import com.synisys.enums.ChangeType;
import com.synisys.models.Change;
import com.synisys.models.File;
import com.synisys.models.Line;
import com.synisys.models.Repository;
import com.synisys.services.api.FileService;

import java.util.List;

public class FileServiceImpl implements FileService {

    @Override
    public File addFile(Repository repository, String name, String location, Double size) {
        File file = new File(name, location, size);
        repository.getLocalChanges().add(new Change(file, ChangeType.ADD));
        return file;
    }

    @Override
    public void deleteFile(Repository repository, File file) {
        repository.getLocalChanges().add(new Change(file, ChangeType.DELETE));
    }

    @Override
    public void editFile(Repository repository, File file, List<Line> changedLines) {
        repository.getLocalChanges().add(new Change(file, ChangeType.EDIT, changedLines));
    }

    @Override
    public void renameFile(Repository repository, File file, String updatedName) {
        file.setName(updatedName);
        repository.getLocalChanges().add(new Change(file, ChangeType.RENAME));
    }
}
