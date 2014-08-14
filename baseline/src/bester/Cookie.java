package bester;

public class Cookie implements Betterable{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean isBetter(Betterable other) {
        return this.numberOfChocolateChips > ((Cookie)other).numberOfChocolateChips;
    }
}
