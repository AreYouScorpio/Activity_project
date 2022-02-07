package activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Activities {

    private List<Activity> activities;
    private ActivityType activityType;


    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public Activities(ActivityType activityType) {
        this.activityType = activityType;
    }

    public void addActivity(Activity a) {
        activities.add(a);
    }

    public List<Report> distancesByTypes(){
        List<Report> result=new ArrayList<>();
        for(ActivityType at : ActivityType.values())
        {
            result.add(new Report(at,activities.stream().filter(a->a.getType()==at).mapToDouble(a->a.getDistance()).sum()));
        }
        return result;

      //return activities.stream().map(a -> new Report(a.getType(), a.getDistance())).toList();

    }

    public int numberOfTrackActivities(){
    return (int)activities.stream().filter(a->a instanceof ActivityWithTrack).count();
    }


    public int numberOfWithoutTrackActivities(){
    return (int)activities.stream().filter(a->a instanceof ActivityWithoutTrack).count();

    }







}
