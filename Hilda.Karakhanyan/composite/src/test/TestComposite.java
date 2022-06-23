package test;


import main.*;

import java.util.List;

public class TestComposite {
    public static void main(String[] args) {
        DirectorySub file1 = new File("file1.txt", "this is the content of file1");
        DirectorySub file2 = new File("file2.txt", "this is the content of file2");
        DirectorySub file3 = new File("file3.txt", "this is the content of file3");

        DirectorySub dir1 = new Directory("dir1", List.of(file1, file2));
        dir1.print();
        System.out.println(dir1.size());
        dir1.compress();
        System.out.println(dir1.size());


        DirectorySub dir2 = new Directory("dir2", List.of(file3, dir1));
        dir2.print();
        System.out.println(dir2.size());
        dir2.compress();
        System.out.println(dir2.size());
        dir2.print();
    }
}
