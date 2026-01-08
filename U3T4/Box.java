public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        this(side,side,side);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return length * width * height;
    }

    public Box greaterVolume(Box otherBox) {
        double box1Vol = volume();
        double box2Vol = otherBox.volume();
        if (box1Vol > box2Vol) {
            return this;
        } else if (box2Vol > box1Vol) {
            return otherBox;
        } else {
            return null;
        }
    }
    
    public String boxInfo() {
        return "Length: " + length + "\nWidth: " + width + "\nHeight: " + height;
    }

    public void addToShape(Shape s) {
        s.attachBox(this);
    }
}