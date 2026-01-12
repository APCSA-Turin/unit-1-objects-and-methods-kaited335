public class RaceUtility {

    private RaceUtility() { }
    
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double kilometers) {
        return kilometers / 1.609;
    }

    public static String makeProper(String str) {
        String before = " ";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (before.equals(" ")) {
                String temp = str.substring(i, i + 1);
                temp = temp.toUpperCase();
                result += temp;
                before = temp;
            } else {
                String temp = str.substring(i, i + 1);
                temp = temp.toLowerCase();
                result += temp;
                before = temp;
            }
        }
        return result;
    }
}
