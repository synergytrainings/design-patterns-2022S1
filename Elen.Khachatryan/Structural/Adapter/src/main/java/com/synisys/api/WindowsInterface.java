package com.synisys.api;

import com.synisys.data_types.Data;
import com.synisys.enums.DataType;

public interface WindowsInterface extends OperationSystem {
    void createWordDocument(String fileName);
    void openMicrosoftEdgeBrowser();
}
