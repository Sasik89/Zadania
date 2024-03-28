package Zadania.coodingbat.string3;


/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab".
Biorąc pod uwagę ciąg znaków, poszukaj ciągu lustrzanego odbicia (wstecznego) zarówno na początku, jak i na końcu danego ciągu.
Innymi słowy zero lub więcej znaków na samym początku danego ciągu i na samym końcu ciągu w odwrotnej kolejności (ewentualnie nakładając się).
Na przykład ciąg „abXYZba” ma lustrzany koniec „ab”.
        mirrorEnds("abXYZba") → "ab"
        mirrorEnds("abca") → "a"
        mirrorEnds("aba") → "aba"*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));


    }
    public static String mirrorEnds(String string) {
        String result = "";
        for(int i=1; i<=string.length();i++){
            if(string.substring(0,i).equals(reverseString(string.substring(string.length()-i,string.length())))){
                result = string.substring(0,i);
            }
        }
        return result;
    }



    public static String reverseString(String string){
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }
}
