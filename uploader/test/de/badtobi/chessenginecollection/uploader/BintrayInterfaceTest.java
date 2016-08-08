package de.badtobi.chessenginecollection.uploader;

import org.junit.Test;

import java.io.File;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class BintrayInterfaceTest {
    @Test
    public void test() {
        BintrayInterface bintrayInterface = new BintrayInterface("b4dt0bi", getApiKey(), "ChessEngineCollection"); // TODO : remove key
        System.out.println(getClass().getClassLoader().getResource("de/badtobi/chessenginecollection/uploader/.").getFile());
        bintrayInterface.uploadFile(new File(getClass().getClassLoader().getResource("de/badtobi/chessenginecollection/uploader/testfile.xml").getFile()), "testfile.xml", "/testfolder/");
    }

    private String getApiKey() {
        return "";
    }
}
