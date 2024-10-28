package book_2.chapter_2;

public class EnumTest
{
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.SPADES;
        System.out.println("The suit is " + suit);
    }
}
