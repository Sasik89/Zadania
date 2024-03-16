package Zadania.coodingbat.logic2;


/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
Chcemy przygotować paczkę docelowych kilogramów czekolady. Mamy małe batoniki (1 kg każdy) i duże batoniki (5 kg każdy).
Zwróć liczbę małych słupków do użycia, zakładając, że zawsze używamy dużych słupków przed małymi słupkami. Zwróć -1, jeśli nie da się tego zrobić.
        makeChocolate(4, 1, 9) → 4
        makeChocolate(4, 1, 10) → -1
        makeChocolate(4, 1, 7) → 2*/

public class Zadanie9 {
    public static void main(String[] args) {

        System.out.println(makeChocolate(4,1,9));
        System.out.println(makeChocolate(4,1,10));
        System.out.println(makeChocolate(4,1,7));
        System.out.println(makeChocolate(9,3,18));
        System.out.println(makeChocolate(60,100,550));

    }
    public static int makeChocolate(int small, int big, int goal) {
        for(int i=0;i<=big;i++){
            for(int j=0;j<=small;j++){
                if((i*5+j*1==goal) && (j<5 || i==big)){ //małych kostek (j) musi być mniej niż 5, gdyż pierw korzystamy z 5 kg sztabek,
                    // jeśli mamy pewność że juz duże paczki skończyły, wówczas małych batonikó może być więcej
                    return j;
                    }
                }
            }
        return -1;
    }
}
