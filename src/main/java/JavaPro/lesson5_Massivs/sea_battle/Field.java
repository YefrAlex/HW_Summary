package JavaPro.lesson5_Massivs.sea_battle;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private char [][] field;
    private char emptyCell = '.';
    private char shipCell = '0';
    private char destroyedShip = 'X';
    private char missedShotCell = '*';
    private List<Ship> ships = new ArrayList<>();
    public Field() {
        field = new char[10][10];
        init();
    }
    private void init () {
        for (int i=0; i < 10; i++) {
            for (int j=0; j < 10 ; j++) {
                field[i][j] = emptyCell;
            }

        }
    }
    public void repaint(){
        for (char[]row : field) {
            for (char cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
