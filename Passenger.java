public abstract class Passenger {
    protected String passengerName; //protected: only defined class and subclasses can access
    protected int number;

    public Passenger(String passengerName, int number) {
        this.passengerName = passengerName;
        this.number = number;
    }
    public abstract void signUpForActivity(Activity activity, Destination destination);//polymorphism - may not be instantiated, and require subclasses to provide implementation (found in premium/ standard/ senior subclasses)

    @Override ////replacing method in parent class w defined class' personal version
    public String toString() {
        return "Passenger" + number + ": " + passengerName;
    }
}
