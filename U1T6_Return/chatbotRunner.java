package U1T6_Return;

public class chatbotRunner {
    
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 4);
        debbie.favoriteday();
        System.out.println(debbie.iLike("hang out with friends"));
        System.out.println(debbie.convertInchesToCentimeters(100));
        debbie.myFavoriteFood();
        System.out.println(debbie.myBirthday("Febuary", 3, 1998));
        System.out.println(debbie.makeInt(10.4));
    }
}


