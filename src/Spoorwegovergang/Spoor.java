package Spoorwegovergang;

import java.util.ArrayList;
import java.util.List;

public class Spoor {
    private List<TreinTracker> treinTrackerList = new ArrayList<TreinTracker>();
    private int state;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllTreinTrackers();
    }

    public void attatch(TreinTracker treinTracker){
        treinTrackerList.add(treinTracker);
    }

    public void notifyAllTreinTrackers(){
        for (TreinTracker treintracker : treinTrackerList){
            treintracker.update();
        }
    }





}
