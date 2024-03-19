package Zadania.coodingbat.string2;


/*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
Zwraca wartość true, jeśli dla każdego „*” (gwiazdy) w ciągu znaków znajdują się znaki zarówno bezpośrednio przed, jak i za gwiazdą, są one takie same.
        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true*/

public class Zadanie16 {
    public static void main(String[] args) {

        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
        System.out.println(sameStarChar("12*2*3*"));

    }
    //wersja częściowo poprawna
    public static boolean sameStarChar(String str) {
        for(int i=0; i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(i+2) && str.charAt(i+1)=='*'){
                return true;
            }
        }
        return false;
    }

    //wersja poprawna
    public static boolean sameStarChar2(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

}
