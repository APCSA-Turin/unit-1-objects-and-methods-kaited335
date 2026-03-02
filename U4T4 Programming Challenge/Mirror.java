
public class Mirror{
    public Mirror(){}

    public String mirrorEnds(String str) {
        int log = 0;
        String reverse = "";
        for (int j = str.length() - 1; j > -1 ; j--) {
            reverse += str.substring(j, j + 1);
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(0, i).equals(reverse.substring(0, i))) {
                log = i;
            } else {
                return str.substring(0,log);
            }
        }
        return str.substring(0, log);
    }
}