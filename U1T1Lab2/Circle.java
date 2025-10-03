public class Circle {
    double radius;
    double area;
    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public void area() {
        area = (radius * radius) * Math.PI;
        System.out.println("A circle with radius "+ radius +" has an area of " + area);
    }
 
 }