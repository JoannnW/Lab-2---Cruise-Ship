import java.util.ArrayList;

public class Destination {
    private final String destination;
    private ArrayList<Activity> activities = new ArrayList<>();

    public Destination(String destination){
        this.destination = destination;
    }

    public void addActivity(Activity activity){
        if (activity != null) {
            activities.add(activity);
        } else {
            System.out.println("Invalid activity. Cannot add null activity.");
        }
    }

    public String getDestName() {
        return destination;
    }

    public ArrayList<Activity> getActivities() {
        return new ArrayList<>(activities); // Return a defensive copy of the activities list
    }
}
