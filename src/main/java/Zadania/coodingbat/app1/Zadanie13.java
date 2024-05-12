package Zadania.coodingbat.app1;

/*The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank.
The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer,
 -1 for each incorrect answer, and +0 for each blank answer.
 Tablica „klucz” to tablica zawierająca prawidłowe odpowiedzi na egzamin, np. {"a", "a", "b", "b"}.
tablica „answers” zawiera odpowiedzi ucznia, z „?” reprezentujący pytanie pozostawione puste.
Obie tablice nie są puste i mają tę samą długość. Zwróć wynik dla tej tablicy odpowiedzi, dając +4 za każdą poprawną odpowiedź,
 -1 za każdą błędną odpowiedź i +0 za każdą pustą odpowiedź.
        scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16*/

public class Zadanie13 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "a", "b", "b"};
        String[] tablica1a = {"a", "c", "b", "c"};
        String[] tablica2 = {"a", "a", "b", "b"};
        String[] tablica2a = {"a", "a", "b", "c"};
        String[] tablica3 = {"a", "a", "b", "b"};
        String[] tablica3a = {"a", "a", "b", "b"};
        String[] tablica4 = {"a", "a", "b", "b"};
        String[] tablica4a = {"?", "c", "b", "?"};


        System.out.println(scoreUp(tablica1,tablica1a));
        System.out.println(scoreUp(tablica2,tablica2a));
        System.out.println(scoreUp(tablica3,tablica3a));
        System.out.println(scoreUp(tablica4,tablica4a));

    }
    public static int scoreUp(String[] key, String[] answers) {
        int sum = 0;
        for(int i = 0; i< key.length;i++){
            if(key[i].equals(answers[i])){
                sum = sum + 4;
            } else if(!key[i].equals(answers[i]) && !answers[i].equals("?")){
                sum = sum -1;
            } else {
            }
        }
        return sum;
    }

}
