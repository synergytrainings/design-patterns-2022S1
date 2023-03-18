package Prototype;

import java.util.concurrent.atomic.AtomicInteger;

public class MainForm implements Form {
    private Integer id;

    private String title;

    public MainForm(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Form clone() {
        Integer cloneId = new AtomicInteger(id).incrementAndGet();
        String cloneTitle = "Clone " + title;
        return new MainForm(cloneId, cloneTitle);
    }
}
