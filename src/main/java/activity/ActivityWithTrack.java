package activity;

public class ActivityWithTrack implements Activity {

    private ActivityType activityType;
    private Track track;

    public ActivityWithTrack( Track track, ActivityType activityType) {
        this.track = track;
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return getDistance();
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
