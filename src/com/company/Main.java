package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.doc");
        File file3 = new File("file3.png");
        File file4 = new File("file4.zip");
        File file5 = new File("file5.xxx");


        Folder folder1 = new Folder("folder_one", file1, file2, file3, file4, file5);
        Folder folder2 = new Folder("folder_two");
        Folder folder3 = new Folder("folder_three");

        Folder root = new Folder("root", folder1, folder2, folder3);

        System.out.println("КОРЕНЬ-----------------");
        System.out.println("Имя: " + root.getName());
        System.out.println("Родитель: " + root.getParent());
        System.out.println("Вложения: " + root.getChilds().toString());
        System.out.println();
        System.out.println("ПАПКА 2го УРОВНЯ-------");
        System.out.println("Имя: " + folder1.getName());
        System.out.println("Родитель: " + folder1.getParent());
        System.out.println("Вложения: " + folder1.getChilds().toString());
        System.out.println("Путь: " + folder1.getPath());

        final Random random = new Random();
        String str = folder1.getChilds().get(random.nextInt(folder1.getChilds().size())).toString();
        System.out.println("Расширение случайного файла в дочерней папке: " + str.substring(str.lastIndexOf(".")));
    }
}

