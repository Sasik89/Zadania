package Zadania.coodingbat.logic1;


/*The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
Wiewiórki w Palo Alto spędzają większość dnia na zabawie. W szczególności grają, jeśli temperatura wynosi od 60 do 90 (włącznie).
O ile nie jest lato, wówczas górny limit wynosi 100 zamiast 90. Biorąc pod uwagę temperaturę int i wartość logiczną isSummer, zwróć wartość true, jeśli wiewiórki grają, i wartość false w przeciwnym razie.
squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true*/

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));

    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp>=60 && temp<=90) {
            return true;
        } if(temp>=60 && temp<=100 && isSummer){
            return true;
        } else {
            return false;
        }
    }
}
