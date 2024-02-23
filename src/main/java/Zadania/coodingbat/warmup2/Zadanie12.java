package Zadania.coodingbat.warmup2;

/*Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
Biorąc pod uwagę ciąg, zwraca wersję, w której wszystkie „x” zostały usunięte. Z wyjątkiem tego, że nie należy usuwać znaku „x” na samym początku lub na końcu.
        stringX("xxHxix") → "xHix"
        stringX("abxxxcd") → "abcd"
        stringX("xabxxxcdx") → "xabcdx"*/

public class Zadanie12 {
    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));

    }
    public static String stringX(String str) {
        int length = str.length();
        if(str.length()<3){
            return str;
        }
        return str.charAt(0) + str.substring(1,str.length()-1).replace("x","")+str.substring(str.length()-1);
    }
}
