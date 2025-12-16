package U3T1;

public class Spinner {
    private int sections;
    private int recentSpin;
    private int spinCount;
    private int spinSum;

    public Spinner(int spinnerSections) {
        sections = spinnerSections;
        recentSpin = 0;
        spinCount = 0;
        spinSum = 0;
    }

    public int getSpinValue() {
        return recentSpin;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public void spin() {
        recentSpin = (int) (Math.random() * sections) + 1;
        spinSum += recentSpin;
        spinCount++;
    }
    public double averageSpin() {
        return (double) spinSum / spinCount;
    }
}
