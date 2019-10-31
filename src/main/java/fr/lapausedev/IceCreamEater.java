package fr.lapausedev;

import java.util.ArrayList;
import java.util.List;

public class IceCreamEater {

    private List<IceCreamFlavour> likes = new ArrayList<>();
    private List<IceCreamFlavour> dislikes = new ArrayList<>();

    private Feeling feeling = Feeling.OK;

    public List getLikes() {
        return likes;
    }

    public List getDislikes() {
        return dislikes;
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public void take(IceCream iceCream) {

        if(iceCream.getScoops()
                .stream()
                .anyMatch(scoop -> {
                    return likes.contains(scoop.getFlavour());
                })) {
            feeling = Feeling.HAPPY;
            return;
        }

        if(iceCream.getScoops()
                .stream()
                .anyMatch(scoop -> dislikes.contains(scoop.getFlavour()))) {
            feeling = Feeling.SAD;
            return;
        }

        feeling = Feeling.OK;
    }
}
