package activity;

public final class Coordinate {
    private final double latitude;
    private final double longitude;


    public Coordinate(double latitude, double longitude) {
        if (latitude>=-90 && latitude<=90) this.latitude = latitude;
        else throw new IllegalArgumentException("Wrong latitude value.");
        if (longitude>=-180 && longitude<=180) this.longitude = longitude;
        else throw new IllegalArgumentException("Wrong longitude value");
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
