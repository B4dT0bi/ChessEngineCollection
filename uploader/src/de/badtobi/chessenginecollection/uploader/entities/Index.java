package de.badtobi.chessenginecollection.uploader.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by B4dT0bi on 09.08.2016.
 */
public class Index {
    private List<AdditionalFileSet> additionalFileSetList = new ArrayList<AdditionalFileSet>();
    private List<ChessEngine> chessEngines = new ArrayList<ChessEngine>();
    private String linkBase = "https://dl.bintray.com/";

    public void addAdditionalFileSet(AdditionalFileSet additionalFileSet) {
        additionalFileSetList.add(additionalFileSet);
    }

    public List<AdditionalFileSet> getAdditionalFileSetList() {
        return additionalFileSetList;
    }

    public void setAdditionalFileSetList(List<AdditionalFileSet> additionalFileSetList) {
        this.additionalFileSetList = additionalFileSetList;
    }

    public void addChessEngine(ChessEngine chessEngine) {
        chessEngines.add(chessEngine);
    }

    public ChessEngine getChessEngine(String name) {
        for (ChessEngine chessEngine : chessEngines) {
            if (chessEngine.getName().equals(name)) return chessEngine;
        }
        return null;
    }

    public List<ChessEngine> getChessEngines() {
        return chessEngines;
    }

    public void setChessEngines(List<ChessEngine> chessEngines) {
        this.chessEngines = chessEngines;
    }
}
