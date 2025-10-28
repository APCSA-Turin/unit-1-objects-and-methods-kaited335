package U1T11;

public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("home", 7));
        System.out.println(methods.funnyString("amazing", 3));
        System.out.println(methods.halvesReversed("maize"));
        System.out.println(methods.pigLatin("robin"));
        System.out.println(methods.removeCharacter("monkey", 3));
        System.out.println(methods.insertAt("water", "_bottle", "a"));
        System.out.println(methods.endUp("people", 4));
        System.out.println(methods.yellOrWhisper("Hello friend!"));
    }
}
