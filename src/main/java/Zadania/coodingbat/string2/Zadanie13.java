package Zadania.coodingbat.string2;


/*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().
Biorąc pod uwagę ciąg znaków, rozważ ciąg przedrostkowy składający się z N pierwszych znaków ciągu. Czy ten ciąg prefiksu pojawia się gdzie indziej w ciągu?
Załóżmy, że ciąg nie jest pusty i że N należy do zakresu 1..str.length().
        prefixAgain("abXYabc", 1) → true
        prefixAgain("abXYabc", 2) → true
        prefixAgain("abXYabc", 3) → false*/

public class Zadanie13 {
    public static void main(String[] args) {

        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));

    }
    public static boolean prefixAgain(String str, int n) {
        if(n>=1 && str.length()>=2){
            String prefix = str.substring(0,n);
            if(str.substring(n,str.length()).contains(prefix)){
                return true;
            }
        }
        return false;
    }

}
