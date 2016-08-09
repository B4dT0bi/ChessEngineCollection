package de.badtobi.chessenginecollection.uploader;

import de.badtobi.chessenginecollection.uploader.entities.ChessEngine;
import de.badtobi.chessenginecollection.uploader.entities.Index;
import de.badtobi.chessenginecollection.uploader.entities.Version;

import java.io.File;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class IndexUpdater {
    private Index index;
    private BintrayInterface bintrayInterface;
    public IndexUpdater(BintrayInterface bintrayInterface) {
        index = bintrayInterface.getIndex();
        this.bintrayInterface = bintrayInterface;
    }

    public void addFile(File file, String folder, String filename, String chessEngineName, String version, String variant, boolean addSignature) {
        ChessEngine chessEngine = index.getChessEngine(chessEngineName);
        Version newVersion = new Version();
        newVersion.setVersionId(version);
        newVersion.setVariant(variant);
        // TODO : generate hash of file and attach it
        newVersion.setLink(filename); // TODO : build complete link? (or put link base into index-class)
        if (addSignature) newVersion.setLinkAsc(filename + ".asc");
        chessEngine.addVersion(newVersion);
        bintrayInterface.uploadFile(file, filename, folder);
    }
}
