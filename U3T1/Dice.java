package U3T1;

public class Dice {
    private int sides;
    private int rollCount;
    private int rollValue;

    public Dice(int diceSides) {
        sides = diceSides;
        rollCount = 0;
        rollValue = 0;
    }

    public int getSides() {
        return sides;
    }

    public int getRollCount() {
        return rollCount;
    }

    public int getRollValue() {
        return rollValue;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }

    public void roll() {
        rollValue = (int) (Math.random() * sides) + 1;
        rollCount++;
    }
}
