import java.util.ArrayList;

public class Standard extends Passenger{
    private int balance;
    private ArrayList<Activity> activities = new ArrayList<>();

    public Standard(String passengerName, int number, int balance){
        super(passengerName, number);
        this.balance = balance;
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination) {
        if (activity.getCost() <= balance && activity.getCapacity() > 0){
            balance -= activity.getCost();
            activities.add(activity);
            activity.setCapacity(activity.getCapacity()-1);
            System.out.println(passengerName + " signed up for " + activity.getActivityName() + " in " + destination.getDestName());
        }else{
            System.out.println("Sorry, " + passengerName + " cannot sign up for \"" + activity.getActivityName() + "\" - Insufficient balance or full capacity.");
        }
    }
}
