/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
 on one side is equal to the sum of the numbers on the other side.

 Biorąc pod uwagę niepustą tablicę, zwróć wartość true, jeśli istnieje miejsce na podzielenie tablicy w taki sposób,
 aby suma liczb po jednej stronie była równa sumie liczb po drugiej stronie.
       canBalance([1, 1, 1, 2, 1]) → true
       canBalance([2, 1, 1, 2, 1]) → false
       canBalance([10, 10]) → true
*/

package Zadania.coodingbat;

public class Zadanie28 {

    // TODO: 13.01.2024 Działa 
    
    public static void main(String[] args) {

        int[] tablica1 = {1, 1, 1, 2, 1};
        int[] tablica2 = {2, 1, 1, 2, 1};
        int[] tablica3 = {10, 10};
        int[] tablica4 = {10, 11, 12, 14, 14, 12, 11, 10};
        
        canBalance(tablica1);
        canBalance(tablica2);
        canBalance(tablica3);
        canBalance(tablica4);
        
    }


    public static void canBalance(int[] tablica) {
        int wartoscKoncowa = tablica.length - 1;
        int wartoscPoczatkowa = 0;
        int sumaLewa = 0;
        int sumaPrawa = 0;
        int srodek = 0;

        while (true) {
            for (int i = wartoscPoczatkowa; i <= srodek; i++) {
                sumaLewa = sumaLewa + tablica[i];
            }
            for (int i = wartoscKoncowa; i > srodek; i--) {
                sumaPrawa = sumaPrawa + tablica[i];
            }
            if (sumaPrawa == sumaLewa) {
                System.out.println("true");
                break;
            }
            sumaLewa = 0;
            sumaPrawa = 0;
            srodek++;
            if (srodek == 5) {
                System.out.println("false");
                break;
            }
        }
    }
}
