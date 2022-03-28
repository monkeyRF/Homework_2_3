package com.company;

public interface FileSystemNode {
    //Возвращающим родительский элемент типа FileSystemNode
    FileSystemNode getParent();
    //Возвращающим имя
    String getName();
    //Возвращающим путь до элемента в условной файловой системе (формат произвольный).
    String getPath();
    //Определить родителя
    void setParent(FileSystemNode parent);
    //Определить путь
    void setPath(String parent);
}
