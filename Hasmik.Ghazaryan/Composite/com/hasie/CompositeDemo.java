package com.hasie;

import com.hasie.helper.Indentation;
import com.hasie.impl.Directory;
import com.hasie.impl.File;

public class CompositeDemo {
    public static void main(String[] args) {
        Indentation indentation = new Indentation();
        Directory dirOne = new Directory("src.com.hasie", indentation);
        Directory dirTwo = new Directory("api", indentation);
        Directory dirThree = new Directory("helper", indentation);
        Directory dirFour = new Directory("impl", indentation);
        File a = new File("AbstractFile.java", indentation);
        File b = new File("Indentation.java", indentation);
        File c = new File("Directory.java", indentation);
        File d = new File("File.java", indentation);
        File e = new File("CompositeDemo.java", indentation);
        dirOne.add(e);
        dirOne.add(dirTwo);
        dirOne.add(dirThree);
        dirOne.add(dirFour);
        dirTwo.add(a);
        dirThree.add(b);
        dirFour.add(c);
        dirFour.add(d);
        dirOne.ls();
    }
}
