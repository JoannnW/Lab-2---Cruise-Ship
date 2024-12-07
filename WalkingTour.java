public class WalkingTour extends Activity{
    private int distance;

    public WalkingTour(String activityName, String desc, int cost, int capacity){
        super(activityName, desc, cost, capacity);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDistance: " + distance + "km";
    }
}
