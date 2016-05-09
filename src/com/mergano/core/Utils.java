package com.mergano.core;

import java.io.File;

public class Utils {

    /* Get the extension of a file */
    public static String getFileExtension(File f) {
        if (!f.getName().contains(".")) {
            return "";
        } else {
            return f.getName().substring(f.getName().length() - 3, f.getName().length());
        }
    }
}
