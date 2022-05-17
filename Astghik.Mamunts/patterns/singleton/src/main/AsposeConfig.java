package main;

import java.util.Locale;
import java.util.Objects;

public class AsposeConfig {

    private String license;

    private String fontDir;

    private Locale locale;

    private static AsposeConfig config;

    private AsposeConfig(String license) {
        this.license = license;
    }

    public static AsposeConfig getConfig() {
        if (config == null) {
            config = new AsposeConfig("Aspose.Total.Java.lic");
        }
        return config;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getFontDir() {
        return fontDir;
    }

    public void setFontDir(String fontDir) {
        this.fontDir = fontDir;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsposeConfig that = (AsposeConfig) o;
        return Objects.equals(license, that.license) && Objects.equals(fontDir, that.fontDir) && Objects.equals(locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(license, fontDir, locale);
    }
}
