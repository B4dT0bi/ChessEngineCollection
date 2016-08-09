package de.badtobi.chessenginecollection.uploader;

import java.io.File;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class Uploader {
    /**
     * @param args 0 = Bintray Username
     *             1 = Api Key
     *             2 = Repo
     *             3 = Version (repo)
     *             4 = file path
     *             5 = folder
     *             6 = filename
     *             7 = chessengine name
     *             8 = variant
     *             9 = version (chess engine)
     */
    public static void main(String[] args) {
        String signKey = System.getenv("GPGPASSWORD");
        BintrayInterface bintrayInterface = signKey == null ?
                new BintrayInterface(args[0], args[1], args[2], args[3])
                : new BintrayInterface(args[0], args[1], args[2], args[3], signKey);
        IndexUpdater indexUpdater = new IndexUpdater(bintrayInterface);

        indexUpdater.addFile(new File(args[4]), args[5], args[6], args[7], args[9], args[8], signKey != null);
    }
}
