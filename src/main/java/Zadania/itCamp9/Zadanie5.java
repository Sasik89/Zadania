package Zadania.itCamp9;

/*
Wygeneruj taka tablice:
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
*/

public class Zadanie5 {
    public static void main(String[] args) {

        int[][] tablica = new int[4][4];

        for(int i=0; i<4;i++){
            for(int j = 0; j<4; j++){
                tablica[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0; i<4;i++){
            for(int j = 0; j<4; j++){
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
