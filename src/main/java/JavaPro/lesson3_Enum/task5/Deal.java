package JavaPro.lesson3_Enum.task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        int cardsForPlayer=5;
        int players;

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        String[] suits={"clubs", "hearts", "diamonds", "spades"};
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numberOfCards=suits.length * ranks.length;
        do {
            System.out.println("Введите количество игроков:");
            players=scanner.nextInt();
        } while (players < 1 || players > numberOfCards / cardsForPlayer);
        System.out.println("Выбрано количество игроков: " + players);

        String[] deck=new String[numberOfCards];

        int counter=0;
        for (int i=0; i < ranks.length; i++) {
            for (int j=0; j < suits.length; j++) {
//                deck[suits.length * i + j] = ranks[i] + " " + suits[j]; автовычесление индекса колоды
                deck[counter]=suits[j] + "_" + ranks[i] +",";
                System.out.println(deck[counter].toUpperCase());
                counter++;

            }
        }
        // System.out.println(Arrays.toString(deck));
        for (int i=0; i < counter; i++) {
            int r=i + (int) (Math.random() * (counter - i)); // случайная карта в колоде
            String temp=deck[r];
            deck[r]=deck[i];
            deck[i]=temp;

        }
        // System.out.println(Arrays.toString(deck));
        String[] playerz=new String[players];
        for (int i=0; i < players; i++) {
            playerz[i]="Player_" + i;
        }
        for (int i=0; i < players; i++) {
            System.out.println(playerz[i] + "  получает на руки карты :");
            for (int j=i; j < cardsForPlayer * players; j+=players) {
                System.out.print(deck[j] + " | ");
            }
            System.out.println();
        }

    }


}
