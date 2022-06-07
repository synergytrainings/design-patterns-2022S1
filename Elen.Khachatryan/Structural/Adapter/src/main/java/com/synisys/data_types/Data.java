package com.synisys.data_types;

public interface Data {
    void write(String data);
    String read();
    void delete();
    void rename(String newName);
    void restore();
}
