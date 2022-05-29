package com.synisys.patterns.iterator.impl;

import com.synisys.patterns.iterator.Iterator;
import com.synisys.patterns.iterator.model.Tree;

public class TreeIterator implements Iterator {
    Tree[] treeList;
    int position = 0;

    public TreeIterator(Tree[] treeList) {
        this.treeList = treeList;
    }

    public boolean hasNext() {
        if (position >= treeList.length ||
                treeList[position] == null) {
            return false;
        } else
            return true;
    }

    public Object next() {
        Tree tree = treeList[position];
        position += 1;
        return tree;
    }
}
