package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackpoint(TrackPoint tp){
        trackPoints.add(tp);
    }

    public Coordinate findMaximumCoordinate(){
        Coordinate result = null;
        return result;
    }

    public Coordinate findMinimumCoordinate(){
        Coordinate result = null;
        return result;
    }

    public double getDistance(){
        double result = 0;
        return result;
    }

    public double getFullDecrease(){
        double result = 0;
        return result;
    }

    public double getFullElevation(){
        double result = 0;
        return result;
    }

    public double getRectangleArea(){
        double result = 0;
        return result;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
