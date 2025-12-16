package U3T1;

public class Prism {
    private int wid;
    private int high;
    private int len;

    public Prism(int length, int width, int height) {
        len = length;
        wid = width;
        high = height;
    }

    public String dimensions() {
        return "Length = " + len + "\nWidth = " + wid + "\nHeight = " + high;
    }

    public int volume() {
        return len * wid * high;
    }

    public int surfaceArea() {
        return (2 * len * wid) + (2 * len * high) + (2 * wid * high);
    }

    public void setLength(int newLength) {
        len = newLength;
    }

    public void setWidth(int newWidth) {
        wid = newWidth;
    }

    public void setHeight(int newHeight) {
        high = newHeight;
    }
}
