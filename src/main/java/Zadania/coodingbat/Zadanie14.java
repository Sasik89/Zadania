/*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

     Mamy króliczki stojące w rzędzie, ponumerowane 1, 2,... Nieparzyste króliczki (1, 3, ..) mają normalne 2 uszy.
     Parzyste króliczki (2, 4, ..) powiedzmy, że mają 3 uszy, ponieważ każdy z nich ma podniesioną stopę.
     Rekurencyjnie zwraca liczbę „uszów” w linii króliczka 1, 2, ... n (bez pętli i mnożenia).

    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
*/

package Zadania.coodingbat;

public class Zadanie14 {

    // TODO: 13.01.2024 Działa

    public static void main(String[] args) {


        int bunnys1 = 0;
        int bunnys2 = 1;
        int bunnys3 = 2;


        System.out.println(bummyEars(bunnys1));
        System.out.println(bummyEars(bunnys2));
        System.out.println(bummyEars(bunnys3));
    }

    public static int bummyEars(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 2;
        }
        if (a % 2 == 0) {
            return bummyEars(a-1) + 3;
        }
        if (a % 2 != 0) {
            return bummyEars(a-1) + 2;
        }
        return 0;
    }
}
