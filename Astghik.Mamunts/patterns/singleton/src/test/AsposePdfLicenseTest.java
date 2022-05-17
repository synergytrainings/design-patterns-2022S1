package test;

import main.PDFExport;
import main.ReportExport;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsposePdfLicenseTest {

    @Test
    public void testEagerInitializedStore() {
        // Config instance is created and the font DIR is set to "/fonts"
        PDFExport pdfExport = new PDFExport();


        ReportExport reportExport = new ReportExport();

        assertEquals(pdfExport.getConfig().hashCode(), reportExport.getConfig().hashCode());
    }

}
