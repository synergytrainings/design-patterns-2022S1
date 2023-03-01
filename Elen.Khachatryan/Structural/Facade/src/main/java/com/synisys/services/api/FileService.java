package com.synisys.services.api;

import com.synisys.models.File;
import com.synisys.models.Line;
import com.synisys.models.Repository;

import java.util.List;

public interface FileService {

    File addFile(Repository repository, String name, String location, Double size);

    void deleteFile(Repository repository, File file);

    void editFile(Repository repository, File file, List<Line> changedLines);

    void renameFile(Repository repository, File file, String updatedName);
}
