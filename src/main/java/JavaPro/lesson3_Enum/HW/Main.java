package JavaPro.lesson3_Enum.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck[] decks=Deck.values();
        int cardsForPlayer=5;
        int players;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Введите количество игроков:");
            players=scanner.nextInt();
        } while (players < 1 || players > decks.length / cardsForPlayer);
        System.out.println("Выбрано количество игроков: " + players);



        Randomizer.randomDeck(decks);
        Deal.razdacha(decks,cardsForPlayer, players);
    }
}
