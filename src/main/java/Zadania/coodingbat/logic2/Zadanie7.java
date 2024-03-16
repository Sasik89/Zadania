package Zadania.coodingbat.logic2;


/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
Biorąc pod uwagę 2 wartości int większe niż 0, zwróć uwagę na wartość najbliższą 21 bez przekraczania. Użyj 0, jeśli oba się przekroczą.
        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19*/

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
    }
    public static int blackjack(int a, int b) {
        if((21-a)>(21-b) && a<=21 && b<=21){
            return b;
        } else if ((21-a)<(21-b) && a<=21 && b<=21) {
            return a;
        } else if(a>21 && b>21){
            return 0;
        } else if (a>21 && b<=21) {
            return b;
        } else if (b>21 && a<=21) {
            return a;
        }
        return 0;
    }

}
