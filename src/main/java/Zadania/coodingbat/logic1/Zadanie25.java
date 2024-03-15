package Zadania.coodingbat.logic1;

/*Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5,
then the return the smaller value. However, in all cases, if the two values are the same, return 0.
Biorąc pod uwagę dwie wartości int, zwróć tę, która jest większa. Jeśli jednak obie wartości mają tę samą resztę przy dzieleniu przez 5,
następnie zwróć mniejszą wartość. Jednak we wszystkich przypadkach, jeśli obie wartości są takie same, zwróć 0.
        maxMod5(2, 3) → 3
        maxMod5(6, 2) → 6
        maxMod5(3, 2) → 3*/

public class Zadanie25 {
    public static void main(String[] args) {

        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));

    }

    public static int maxMod5(int a, int b) {
        if(a%5==b%5){
            if(a<b){
                return a;
            }
            if(a>b){
                return b;
            }
        } else if(a>b){
            return a;
        } else if(b>a){
            return b;
        }
        else if (a==b) {
            return 0;
        }
        return 0;
    }
}
