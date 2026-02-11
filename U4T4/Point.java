package U4T4;

public class Point {
  private int x;
  private int y;
  public Object setX;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    return Math.sqrt(Math.pow((x - other.getX()),2) + Math.pow((y - other.getY()),2));
  }

  //You will need a getX() and getY() method

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }

  
  // Returns a string in the format: (x, y)
  public String pointInfo() {
   return "(" + x + ", " + y + ")";
  }
}