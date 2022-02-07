package activity;

import java.util.ArrayList;
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
    return null;
    }

    public int numberOfTrackActivities(){
    return (int)activities.stream().filter(a->a.getType()!=null).count();

    }
    public int numberOfWithoutTrackActivities(){
    return (int)activities.stream().filter(a->a.getType()==null).count();

    }







}
