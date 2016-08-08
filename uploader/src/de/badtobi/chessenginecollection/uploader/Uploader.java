package de.badtobi.chessenginecollection.uploader;

import java.io.File;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class Uploader {
    public static void main(String [] args) {
        BintrayInterface bintrayInterface = new BintrayInterface(args[0], args[1], args[2], args[3]);
        bintrayInterface.uploadFile(new File(args[4]), "testfile.xml", "testfolder");
    }
}
