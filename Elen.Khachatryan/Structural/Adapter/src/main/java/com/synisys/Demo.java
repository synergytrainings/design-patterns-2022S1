package com.synisys;

import com.synisys.adapter.MacToWindowAdapter;
import com.synisys.api.WindowsInterface;
import com.synisys.impl.Mac;

public class Demo {
    public static void main(String[] args) {
        Mac macOS = new Mac();
        WindowsInterface windows = new MacToWindowAdapter(macOS);

        windows.openMicrosoftEdgeBrowser();
    }
}
