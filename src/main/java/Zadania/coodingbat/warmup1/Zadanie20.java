package Zadania.coodingbat.warmup1;

/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
Zwróć wartość true, jeśli podany ciąg zaczyna się od „mix”, z tą różnicą, że „m” może mieć dowolną wartość, zatem „pix”, „9ix” .. wszystko się liczy.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false*/


public class Zadanie20 {
    public static void main(String[] args) {

        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));

    }
    public static boolean mixStart(String str) {
        char[] tablica = str.toCharArray();
        if(str.length()>=3 && tablica[1] == 'i' && tablica[2] == 'x'){
            return true;
        }
        return false;
    }

}
