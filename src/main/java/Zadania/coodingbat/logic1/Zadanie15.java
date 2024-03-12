package Zadania.coodingbat.logic1;

/*Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.
Dzwoni Twój telefon komórkowy. Zwróć wartość true, jeśli powinieneś odpowiedzieć. Zwykle odbierasz, chyba że rano odbierasz tylko wtedy, gdy dzwoni twoja mama.
We wszystkich przypadkach, jeśli śpisz, nie odpowiadasz.
        answerCell(false, false, false) → true
        answerCell(false, false, true) → false
        answerCell(true, false, false) → false*/

public class Zadanie15 {
    public static void main(String[] args) {

        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));

    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMom == true && isAsleep == false ) {
            return true;
        }else if (isAsleep == true && isMorning == true && isMom == true) {
            return false;
        }
        else if (isMorning == true && isMom == true) {
            return true;
        } else if (isAsleep == false && isMorning == false && isMom == false) {
            return true;
        }  else if (isAsleep == true) {
            return false;
        } else {
            return false;
        }
    }

}
