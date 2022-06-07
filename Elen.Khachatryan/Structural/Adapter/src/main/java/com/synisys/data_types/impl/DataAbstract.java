package com.synisys.data_types.impl;

import com.synisys.data_types.Data;
import com.synisys.enums.ComputerOperationSystems;

import java.util.Objects;

public abstract class DataAbstract implements Data {
    private String name;
    private double size;
    private String path;
    private StringBuilder dataBuilder;
    private ComputerOperationSystems os;
    private CharSequence delimiter;
    private String extension;

    public DataAbstract(String name, double size, ComputerOperationSystems os, String extension, String ...path) {
        Objects.requireNonNull(extension);
        this.name = name;
        this.size = size;
        this.os = os;
        this.extension= extension;
        this.path = this.createPath(path);
        this.dataBuilder = new StringBuilder();
    }

    protected String createPath(String ...path){
        return String.join(this.getDelimiter(), path);
    }

    @Override
    public String read() {
        return dataBuilder.toString();
    }

    @Override
    public void write(String data) {
        Objects.requireNonNull(data);
        this.dataBuilder.append(data);
    }

    @Override
    public void delete() {
        System.out.println("Delete File");
    }

    @Override
    public void rename(String newName) {
        this.setName(newName);
    }

    @Override
    public void restore() {
        System.out.println("Restoring File");
    }

    public void setSize(double size) {
        if (this.size < 0){
            throw new IllegalArgumentException("File Size can not be negative.");
        }
        this.size = size;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);
        // also check for duplicate file name in a directory
        this.name = name;
    }

    public void setDelimiter(CharSequence delimiter) {
        switch (this.os){
            case MAC: {
                this.delimiter = ":";
                break;
            }
            case LINUX: {
                this.delimiter = "/";
                break;
            }
            case WINDOWS: {
                this.delimiter = "\\";
                break;
            }
        }

        this.delimiter = delimiter;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public CharSequence getDelimiter() {
        return delimiter;
    }
}
