public class Activity {
    private String activityName;
    private String desc;
    private double cost;
    private int capacity;

    public Activity(String activityName, String desc, int cost, int capacity){
        this.activityName = activityName;
        this.desc = desc;
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override //replacing method in parent class w defined class' personal version
    public String toString() {
        return activityName + " - " + desc + "\nCost: " + cost + "\nCapacity: " + capacity;
    }

    //getter and setter methods
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

