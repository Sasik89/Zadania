package Zadania.coodingbat.string2;

/*Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"*/

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }
    public static String doubleChar(String str) {
        String result = "";
        char[] charArray = str.toCharArray();
        for(int i=0; i<str.length();i++){
            int counter = 0;
            while(counter<=1){
                result = result+ charArray[i];
                counter = counter+1;
            }
        }
        return result;
    }
}
