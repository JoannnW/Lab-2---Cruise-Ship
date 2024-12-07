import java.util.ArrayList;

public class Senior extends Passenger{
    private int balance;
    private ArrayList<Activity> activities = new ArrayList<>();

    public Senior(String passengerName, int number, int balance){
        super(passengerName, number);
        this.balance = balance;
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination){
        int discountCost = (int) (activity.getCost() * 0.9);
        if (discountCost <= balance && activity.getCapacity() > 0){
            balance -= discountCost;
            activities.add(activity);
            activity.setCapacity(activity.getCapacity()-1);
            System.out.println(passengerName + " signed up for " + activity.getActivityName() + " in " + destination.getDestName() + "with discount.");
        }else {
            System.out.println("Sorry, " + passengerName + " cannot sign up for \"" + activity.getActivityName() + "\" - Insufficient balance or full capacity.");
        }
    }
}
