package Zadania.coodingbat.string2;

/*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
except for appearances of the word string which are preserved unchanged.
        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/

public class Zadanie20 {
    public static void main(String[] args) {

        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));

    }
    public static String plusOut(String str, String word) {
        String result = str.replace(word,"$");
        char[] tablicaChar = result.toCharArray();
        for(int i=0; i<result.length();i++) {
            if(tablicaChar[i] != '$'){
                tablicaChar[i] = '+';
            }
        }
        String result2 = new String(tablicaChar);
        return result2.replace("$", word);
    }

}
