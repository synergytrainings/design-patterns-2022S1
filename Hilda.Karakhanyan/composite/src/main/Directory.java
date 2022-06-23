package main;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractDirectorySub {

    private List<DirectorySub> subs;

    public Directory(String name) {
        super(name);
        this.subs = new ArrayList<>();
        setSize(0);
    }

    public Directory(String name, List<DirectorySub> subs) {
        super(name);
        this.subs = subs;
        setSize(subs.stream().reduce(0.0, (subTotal, e) -> subTotal + e.size(), Double::sum));
    }

    @Override
    public void print() {
        subs.forEach(sub -> {
            if (sub instanceof Directory) {
                System.out.println("Directory = [");
                sub.print();
                System.out.println("]");
            } else {
                sub.print();
            }
        });
    }

    @Override
    public void compress() {
        subs.forEach(DirectorySub::compress);
    }

    @Override
    public void clearContent() {
        subs.clear();
    }

    public List<DirectorySub> getSubs() {
        return subs;
    }

    public void setSubs(List<DirectorySub> subs) {
        this.subs = subs;
    }

}
