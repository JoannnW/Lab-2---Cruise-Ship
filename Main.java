import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Scenario 1: Cruise SHip + add Destinations w Activities
        System.out.println("Scenario 1: Initalize Cruise Ship and add destinations with activities");
        CruiseShip ship = new CruiseShip("Titanic", 3);
        Destination underworld = new Destination("Underworld");
        Destination heaven = new Destination("Heaven");

        underworld.addActivity(new WalkingTour("Hades' Palace", "Peek into the life of the death king! Proceed with caution, there's chance you might be incinerated if you aggravate him.", 200, 20));
        underworld.addActivity(new Attraction("Garden of Sinful Souls", "Meet and greet the punished dead. Remember to bring the newest brand of sin-repellent spray!", 100, 30));
        heaven.addActivity(new TheatreShow("God's mammals", "Live performance on God's creations and his delicate craftsmanship of the special mammals called humans", 4000, 1, new ArrayList<>(Arrays.asList("God", "Bob the OG human")), new ArrayList<>(Arrays.asList("Lead", "Side Character 1"))));

        ship.addDestination(underworld);
        ship.addDestination(heaven);

        // Scenario 2: Add Passengers and attempt to sign them up for Activities
        //This shld print out:
        //Twolive signed up for Hades' Palace in underworld
        //Bridget signed up for Garden of Sinful Souls with discount.
        //Fang signed up for God's mammals in heaven for free.
        System.out.println("\nScenario 2: Add passengers and sign them up for activities.");
        Standard passenger1 = new Standard("Twolive", 1, 100000);
        Senior passenger2 = new Senior("Bridget", 2, 100);
        Premium passenger3 = new Premium("Fang", 3);

        ship.addPassenger(passenger1);
        ship.addPassenger(passenger2);
        ship.addPassenger(passenger3);

        // signing up for activities...
        passenger1.signUpForActivity(underworld.getActivities().get(0), underworld); // shld succeed
        passenger2.signUpForActivity(underworld.getActivities().get(1), underworld); // shld succeed w discount
        passenger3.signUpForActivity(heaven.getActivities().get(0), heaven); // shld succeed for free

        // Scenario 3: Print Ship and Itinerary
        //This shld print out:
        //Ship Name: Titanic
        //Passenger Capacity: 40
        //Current Number of Passengers: 3
        // Passenger 101: Twolive
        // Passenger 102: Bridget
        // Passenger 103: Fang
        //Itinerary for Titanic
        //Destination: underworld
        //Activity: Hades' Palace - Peek into the life of the death king! Proceed with caution, there's chance you might be incinerated if you aggravate him.
        //Cost: 200
        //Capacity: 20
        //Activity: Garden of Sinful Souls - Meet and greet the punished dead. Remember to bring the newest brand of sin-repellent spray!
        //Cost: 100
        // Capacity: 30
        // Destination: heaven
        //Activity: God's mammals - Live performance on God's creations and his delicate craftsmanship of the special mammals called humans
        //Cost: 4000
        //Capacity: 10
        //Stars: God as Lead, Bob the OG human as Side Character 1
        System.out.println("\nScenario 3: Print ship and itinerary.");
        ship.printShipDetails();
        ship.printItinerary();

        // Scenario 4: Too many passengers
        //This shld print out:
        //Sorry, Titanic has reached its maximum capacity.
        System.out.println("\nScenario 4: Attempt to add too many passengers.");
        ship.addPassenger(new Premium("Ms Nahar", 4)); // shld fail due to capacity limit

        //Scenario 5: Check capacity of activity (sign up for an alr full activity)
        //This shld print out:
        //Sorry, "God's mammals" is full.
        System.out.println("Scenario 5: Sign up for an alr full activity");
        Premium passenger4 = new Premium("Ethan", 5);
        ship.addPassenger(passenger4);
        passenger4.signUpForActivity(heaven.getActivities().get(0),underworld); //shld fail, Fang took the spot

        //Scenario 6: Passenger with insufficient balance
        //This shld print out:
        //Bridget signed up for Garden of Sinful Souls in underground with discount.
        //Sorry, Bridget cannot sign up for Hades' Palace - Insufficient balance or full capacity.
        System.out.println();
        passenger2.signUpForActivity(underworld.getActivities().get(1),underworld); //just enough, succeed
        passenger2.signUpForActivity(underworld.getActivities().get(0),underworld); //shld fail

    }
}
