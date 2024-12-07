import java.util.ArrayList;

public class TheatreShow extends Activity{
    private ArrayList<String> stars;
    private ArrayList<String> starsCharacter;

    public TheatreShow(String activityName, String desc, int cost, int capacity, ArrayList<String> stars, ArrayList<String> starsCharacter){
        super(activityName, desc, cost, capacity);
        this.stars = stars;
        this.starsCharacter = starsCharacter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());//makes everything string (user friendly compared to string)
        stringBuilder.append("\n- Stars: ");
        for (int i = 0; i < starsCharacter.size(); i++){
            if (i > 0){
                stringBuilder.append(stars.get(i) + "as" + starsCharacter.get(i));
            }
        }
        return stringBuilder.toString();
    }
}
