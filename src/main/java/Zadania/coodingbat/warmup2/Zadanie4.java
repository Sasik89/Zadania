package Zadania.coodingbat.warmup2;

/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
Biorąc pod uwagę ciąg znaków, zwraca wartość true, jeśli po pierwszym wystąpieniu „x” w ciągu bezpośrednio następuje kolejne „x”.
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true*/

public class Zadanie4 {
    public static void main(String[] args) {

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

    }
    static boolean doubleX(String str) {
        char[] tablica = str.toCharArray();
        boolean result = false;
        int firstAppearance = str.indexOf('x');
        if(str.contains("x") && str.length()>firstAppearance+1 && tablica[firstAppearance]==tablica[firstAppearance+1]){
            result = true;
            }
        return result;
        }
    }
