package com.company;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    private final String name;
    private FileSystemNode parent;
    private String path;

    public AbstractFileSystemNode(String name) {
        this.name = name;
    }

    @Override
    public void setParent(FileSystemNode parent) {
        this.parent = parent;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public final FileSystemNode getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        return path + "/" + name;
    }

    @Override
    public String toString() {
        return name;
    }
}