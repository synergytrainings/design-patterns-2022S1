package com.synisys.patterns.kingdoms;

import com.synisys.patterns.AbstractKingdom;
import com.synisys.patterns.Kingdom;

/**
 * Created by emma.sargsyan
 */
public class Fungi extends AbstractKingdom {

    private String cellWalls;

    public Fungi(String cellWalls) {
        super("Fungi", false);
        this.cellWalls = cellWalls;
    }

    @Override
    public void printDescription() {
        System.out.println("Fungi with " + cellWalls + " cell walls");
    }

    @Override
    public Kingdom doClone() throws CloneNotSupportedException {
        return new Fungi(cellWalls);
    }
}