package JavaPro.lesson3_Enum.HW;

public class Deal {
    public static void razdacha(Deck[] decks, int cardsForPlayer,int players) {

            String[] playerz=new String[players];
            for (int i=0; i < players; i++) {
                playerz[i]="Player_" + i;
            }
            for (int i=0; i < players; i++) {
                System.out.println(playerz[i] + "  получает на руки карты :");
                for (int j=i; j < cardsForPlayer * players; j+=players) {
                    System.out.print(decks[j] + " | ");
                }
                System.out.println();
            }
        }
    }

