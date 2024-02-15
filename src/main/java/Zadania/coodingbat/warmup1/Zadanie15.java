package Zadania.coodingbat.warmup1;

/*Given two temperatures, return true if one is less than 0 and the other is greater than 100.
Biorąc pod uwagę dwie temperatury, zwróć wartość true, jeśli jedna jest mniejsza niż 0, a druga większa niż 100.

        icyHot(120, -1)
        icyHot(-1, 120)
        icyHot(2, 120)*/

public class Zadanie15 {
    public static void main(String[] args) {

        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));

    }
    public static boolean icyHot(int temp1, int temp2) {
        if(temp1<0 && temp2>100 || temp1>100 && temp2<0){
            return true;
        }return false;
    }
}
