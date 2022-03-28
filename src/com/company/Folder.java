package com.company;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode implements FileSystemNode {
    private final ArrayList<FileSystemNode> childs = new ArrayList<>();

    //принимающий в конструкторе переменное число аргументов
    //типа FileSystemNode
    public Folder (String name, FileSystemNode ... folders) {
        super(name);
        // Перебераем массив параметров
        for (FileSystemNode folder : folders) {
            folder.setParent(this);
            folder.setPath(this.getName());
            this.childs.add(folder);
        }
    }

    public ArrayList<FileSystemNode> getChilds() {
        return childs;
    }

}