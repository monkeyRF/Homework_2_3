package com.company;

public class File extends AbstractFileSystemNode implements FileSystemNode{
    private String name;

    public File(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

}