package com.synisys.patterns.iterator.model;

public class Tree extends Plant {
    private final Integer age;

    public Tree(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + getName() + '\'' +
                ", age=" + age +
                '}';
    }
}
