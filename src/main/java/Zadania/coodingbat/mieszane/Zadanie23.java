/*

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

Biorąc pod uwagę 2 wartości int większe niż 0, zwróć wartość najbliższą 21 bez przechodzenia. Zwróć 0, jeśli oba przejdą.

        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19
*/

package Zadania.coodingbat.mieszane;

public class Zadanie23 {

    // TODO: 13.01.2024 Nie działa

    public static void main(String[] args) {

    int[] tablica1 = {19, 21};
    int[] tablica2 = {21, 19};
    int[] tablica3 = {19, 22};
    int[] tablica4 = {21, 21};

    blackjack(tablica1);
    blackjack(tablica2);
    blackjack(tablica3);
    blackjack(tablica4);

    }

    public static void blackjack(int[] tablica){
        if(tablica[0] == tablica[1]){
            System.out.println(0);
        } if(tablica[0] != tablica[1] && tablica[0] == 21){
            System.out.println(21);
        } if(((tablica[0] != 21)) && (tablica[1] == 21)){
            System.out.println(21);
        } if(tablica[1] != 21) {
            System.out.println(tablica[0]);
        }
    }
}
