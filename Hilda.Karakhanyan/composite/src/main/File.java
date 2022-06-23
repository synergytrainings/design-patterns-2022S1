package main;

public class File extends AbstractDirectorySub {

    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
        setSize(content.length());
    }

    @Override
    public void print() {
        System.out.println("File{" +
                "content='" + content + '\'' +
                '}');
    }

    @Override
    public void compress() {
        content = content.substring(0, content.length() / 2);
        setSize(content.length());
    }

    @Override
    public void clearContent() {
        content = null;
        setSize(0);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
