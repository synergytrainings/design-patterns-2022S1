package Prototype;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StackOverflowCode implements Code {

    private final List<String> codeLines;

    public StackOverflowCode(String url) {
        Objects.requireNonNull(url);
        this.codeLines = Collections.singletonList(String.format("let codeUrl = '%s';", url));
    }

    private StackOverflowCode(List<String> codeLines) {
        this.codeLines = codeLines;
    }

    @Override
    public String getContent() {
        return String.join("\n", this.codeLines);
    }

    @Override
    public Code clone() {
        return new StackOverflowCode(codeLines);
    }
}
