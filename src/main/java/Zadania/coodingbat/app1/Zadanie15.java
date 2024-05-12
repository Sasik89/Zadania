package Zadania.coodingbat.app1;


/*Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90.
Return the sum of largest special score in A and the largest special score in B.
To practice decomposition, write a separate helper method which finds the largest special score in an array.
Write your helper method after your scoresSpecial() method in the JavaBat text area.
Biorąc pod uwagę dwie tablice, A i B, nieujemnych wyników typu int. Wynik „specjalny” to taki, który jest wielokrotnością liczby 10, na przykład 40 lub 90.
Zwróć sumę największego wyniku specjalnego w A i największego wyniku specjalnego w B.
Aby poćwiczyć dekompozycję, napisz osobną metodę pomocniczą, która znajdzie największy wynik specjalny w tablicy.
Wpisz metodę pomocniczą po metodzie scoresSpecial() w obszarze tekstowym JavaBat.
        scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
        scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
        scoresSpecial([12, 11, 4], [2, 20, 31]) → 20*/


public class Zadanie15 {
    public static void main(String[] args) {

        int[] tablica1 = {12, 10, 4};
        int[] tablica1a = {2, 20, 30};
        int[] tablica2 = {20, 10, 4};
        int[] tablica2a = {2, 20, 10};
        int[] tablica3 = {12, 11, 4};
        int[] tablica3a = {2, 20, 31};

        System.out.println(scoresSpecial(tablica1,tablica1a));
        System.out.println(scoresSpecial(tablica2,tablica2a));
        System.out.println(scoresSpecial(tablica3,tablica3a));

    }
    public static int scoresSpecial(int[] a, int[] b) {
        return max(a)+max(b);
    }

    public static int max(int[] array){
        int max = 0;
        for(int element : array){
            if(element%10 == 0 && element>max){
                max = element;
            }
        }
        return max;
    }

}
