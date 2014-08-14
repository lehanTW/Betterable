package bester;

import java.util.List;

/**
 * Created by hanlei on 8/14/14.
 */
public class Bester<T extends Betterable> {
    private List<T> betterables;

    public Bester(List<T> betterables) {
        this.betterables = betterables;
    }


    public T getBest() throws IllegalArgumentException {
        T currentBest = null;
        if (betterables.size() > 0) {
            currentBest = betterables.get(0);
            for (T betterable : betterables) {
                if (betterable.isBetter(currentBest)) {
                    currentBest = betterable;
                }
            }
        } else {
            throw new IllegalArgumentException("List was empty");
        }
        return currentBest;
    }
}
