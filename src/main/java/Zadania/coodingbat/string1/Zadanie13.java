package Zadania.coodingbat.string1;

/*Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
Biorąc pod uwagę ciąg, zwróć ciąg o długości 1 od jego przodu, chyba że przód ma wartość false. W takim przypadku zwróć ciąg o długości 1 od jego tyłu. Ciąg nie będzie pusty.
        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"*/

public class Zadanie13 {
    public static void main(String[] args) {

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));

    }
    public static String theEnd(String str, boolean front) {
        if(front!=true){
            return str.substring(str.length()-1, str.length());
        } else{
            return str.substring(0, 1);
        }
    }

}
