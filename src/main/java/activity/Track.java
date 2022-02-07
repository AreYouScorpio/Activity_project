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

        double sum=0;
        if (trackPoints.size()==0) return 0;
        for (int i=1; i<trackPoints.size();i++) {
            sum+=trackPoints.get(i-1).getDistanceFrom(trackPoints.get(i));

            System.out.println(sum);
        //System.out.println(trackPoints.get(trackPoints.size()-2).getDistanceFrom(trackPoints.get(trackPoints.size()-1)));
    }
        return sum;
    }

    public double getFullDecrease(){
        double sum=0;
        for (int i=1; i<trackPoints.size();i++) {
            if ((trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation())<0)
                sum-=trackPoints.get(i-1).getElevation()+trackPoints.get(i).getElevation();
        }
        return -sum;
    }

    public double getFullElevation(){
        double sum=0;
        for (int i=1; i<trackPoints.size();i++) {
            if ((trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation())>0)
            sum+=trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation();
        }
        return sum;
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
