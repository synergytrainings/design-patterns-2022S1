package com.synisys.patterns.iterator.impl;

import com.synisys.patterns.iterator.Collection;
import com.synisys.patterns.iterator.model.Tree;

public class TreeCollection implements Collection {
    private Tree[] trees;
    private int numberOfTrees;

    public TreeCollection() {
        this.trees = new Tree[10000];
        this.numberOfTrees = 0;
    }

    public void plant(Tree tree) {
        trees[numberOfTrees] = tree;
        numberOfTrees = numberOfTrees + 1;
    }


    public TreeIterator createIterator() {
        return new TreeIterator(trees);
    }
}
