package U1T12;

public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double num = Math.pow(base,2) + Math.pow(height,2);
        num = Math.sqrt(num);
        return num;
    }
    
}
