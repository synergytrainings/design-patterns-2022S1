package Prototype;

import java.util.concurrent.atomic.AtomicInteger;

public class SubForm implements Form {
    private Integer id;

    private String title;

    private Integer parentId;

    public SubForm(Integer id, Integer parentId, String title) {
        this.id = id;
        this.parentId = parentId;
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
        return new SubForm(cloneId, parentId, cloneTitle);
    }
}
