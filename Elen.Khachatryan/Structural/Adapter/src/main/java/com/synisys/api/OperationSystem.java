package com.synisys.api;

import com.synisys.data_types.Data;
import com.synisys.enums.DataType;

public interface OperationSystem {
    String readData(String name, DataType type, String... path);
    void writeData(Data file, String data);
    Data getFile(String name, DataType type, String... path);
}
