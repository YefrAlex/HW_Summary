package JavaPro.lesson3_Enum.HW;

public class Randomizer {
    public static Deck[] randomDeck (Deck [] decks){
        for (int i=0; i < decks.length; i++) {
            int r=i + (int) (Math.random() * (decks.length - i)); // случайная карта в колоде
            Deck temp=decks[r];
            decks[r]=decks[i];
            decks[i]=temp;
        }
        return decks;
    }
}
