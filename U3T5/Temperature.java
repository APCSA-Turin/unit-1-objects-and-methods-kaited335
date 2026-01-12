public class Temperature {
    private double high;
    private double low;
    private String scale;

    public Temperature(double highTemp, double lowTemp, String tempScale) {
        high = highTemp;
        low = lowTemp;
        if (tempScale.equals("C")){
            scale = "C";
        } else {
            scale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return (temp * (9.0/5)) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * (5.0/9);
    }

    public void changeToF() {
        if (scale.equals("C")) {
            high = convertCtoF(high);
            low = convertCtoF(low);
            scale = "F";
        }
    }

    public void changeToC() {
        if (scale.equals("F")) {
            high = convertFtoC(high);
            low = convertFtoC(low);
            scale = "C";
        }
    }

    public String tempInfo() {
        return "High Temperature: " + high + " " + scale + "\nLow Temperature: " + low + " " + scale;
    }
}
