package Zadania.coodingbat.logic1;

/*We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
Organizujemy imprezę z dużą ilością herbaty i słodyczy. Zwraca wynik int imprezy zakodowany jako 0=zły, 1=dobry lub 2=świetny.
Impreza jest dobra (1), jeśli ilość herbaty i słodyczy wynosi co najmniej 5. Jeśli jednak ilość herbaty lub słodyczy jest co najmniej dwukrotnie większa od drugiej, impreza jest świetna (2).
Jednakże we wszystkich przypadkach, jeśli wartość herbaty lub słodyczy jest mniejsza niż 5, impreza jest zawsze zła (0).
        teaParty(6, 8) → 1
        teaParty(3, 8) → 0
        teaParty(20, 6) → 2*/

public class Zadanie16 {
    public static void main(String[] args) {

        System.out.println(teaParty(6,8));
        System.out.println(teaParty(3,8));
        System.out.println(teaParty(20,6));

    }
    public static int teaParty(int tea, int candy) {
        if(tea <5 && candy <5){
            return 0;
        } else if (tea >= 2*candy && candy>=5 || candy >= 2*tea && tea>=5) {
            return 2;
        } else if (tea>=5 && candy>=5) {
            return 1;
        }
        return 0;
    }

}
