package Zadania.coodingbat.app1;


/*Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end.
Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area.
Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
Mając tablicę wyników, oblicz średnią całkowitą pierwszej i drugiej połowy i zwróć tę, która jest większa.
Powiemy, że druga połowa zaczyna się od długości indeksu/2. Długość tablicy będzie wynosić co najmniej 2. Aby przećwiczyć dekompozycję, napisz osobną metodę pomocniczą
int średnia(int[] wyniki, int początek, int koniec) { który oblicza średnią elementów pomiędzy indeksami start..end.
Wywołaj metodę pomocniczą dwa razy, aby zaimplementować scoresAverage(). Wpisz metodę pomocniczą po metodzie scoresAverage() w obszarze tekstowym JavaBat.
Zwykle oblicza się średnie za pomocą liczb podwójnych, ale tutaj używamy liczb całkowitych, więc oczekiwane wyniki są dokładne.
        scoresAverage([2, 2, 4, 4]) → 4
        scoresAverage([4, 4, 4, 2, 2, 2]) → 4
        scoresAverage([3, 4, 5, 1, 2, 3]) → 4*/


import java.util.Arrays;
import java.util.OptionalDouble;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 2, 4, 4};
        int[] tablica2 = {4, 4, 4, 2, 2, 2};
        int[] tablica3 = {3, 4, 5, 1, 2, 3};

        System.out.println(scoresAverage(tablica1));
        System.out.println(scoresAverage(tablica2));
        System.out.println(scoresAverage(tablica3));


    }
    public static int scoresAverage(int[] scores) {
        OptionalDouble firstAvg = Arrays.stream(scores).limit(scores.length/2).average();
        OptionalDouble secondAvg = Arrays.stream(scores).skip(scores.length/2).average();

        if(firstAvg.getAsDouble()>secondAvg.getAsDouble()){
            return (int) firstAvg.getAsDouble();
        }

        return (int) secondAvg.getAsDouble();
    }
}

