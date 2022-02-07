package activity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();



    public void addTrackPoint(TrackPoint tp){
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

    public void loadFromGpx(InputStream is){
        Scanner scanner = new Scanner(is);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }


}
