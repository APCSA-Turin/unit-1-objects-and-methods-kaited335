package U1T6_Return;

public class ChatBot {

   // instance variables
   private String name;
   private int number;

   // constructor
   public ChatBot(String chatBotName, int faveNum) {
       name = chatBotName;
       number = faveNum;
   }

  public void favoriteday() {
        System.out.println("Hello, December 26 is my favorite day.");
   }
   public String iLike(String whatYouLikeToDo) {
        return name + " I like to " + whatYouLikeToDo;
   }
   public double convertInchesToCentimeters(int numInches) {
        final double CENTIMETERS_Per_INCH = 2.54;
        return CENTIMETERS_Per_INCH * numInches;
   }
   public void myFavoriteFood (){
    System.out.println("I don't have a favorite food because I'm a chatbot and I can't eat anything.");
    System.out.println(number);
  }

   public String myBirthday(String month, int day, int year){
    return "I was created on " + month + " " + day + ", " + year; 
   }
   public int makeInt (double number) {
    return (int) number;
   }
}
