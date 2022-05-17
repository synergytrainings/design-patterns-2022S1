package main;

import java.util.Locale;

public class PDFExport {

    private AsposeConfig config;

    public PDFExport() {
        initAspose();
    }

    public void export() {
    }

    private void initAspose() {
        config = AsposeConfig.getConfig();
        config.setLocale(Locale.US);
        config.setFontDir("/fonts");
    }

    public AsposeConfig getConfig() {
        return config;
    }
}
