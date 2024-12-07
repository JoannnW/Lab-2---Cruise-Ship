import java.util.ArrayList;

public class Premium extends Passenger{
    private ArrayList<Activity> activities = new ArrayList<>();

    public Premium(String passengerName, int number){
        super(passengerName, number);
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination){
        if (activity.getCapacity() > 0){
            activities.add(activity);
            System.out.println(passengerName + " signed up for " + activity.getActivityName() + "in" + destination.getDestName() + " for free.");
            activity.setCapacity(activity.getCapacity()-1);
        }else{
            System.out.println("Sorry, \"" + activity.getActivityName() + "\" is full.");
        }
    }
}
