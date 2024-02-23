package Zadania.coodingbat.warmup2;

/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
since the "xx", "aa", and "az" substrings appear in the same place in both strings.
Biorąc pod uwagę 2 ciągi znaków a i b, zwróć liczbę pozycji, w których zawierają one podciąg o tej samej długości 2. Zatem „xxcaazz” i „xxbaaz” dają 3,
ponieważ podciągi „xx”, „aa” i „az” pojawiają się w tym samym miejscu w obu ciągach.
        stringMatch("xxcaazz", "xxbaaz") → 3
        stringMatch("abc", "abc") → 2
        stringMatch("abc", "axc") → 0*/

public class Zadanie11 {
    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));


    }
    public static int stringMatch(String a, String b) {
        int stringLength = 0;
        if(a.length()>b.length()){
            stringLength=b.length();
        } else{
            stringLength=a.length();
        }
        int counter = 0;
        for(int i=0; i<(stringLength-1);i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                counter++;
            }
        }
        return counter;
    }
}
