package Zadania.coodingbat.string2;


/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on.
 Any leftover chars go at the end of the result.
        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/
public class Zadanie9 {
    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

    }
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        if(a.length()>=0 && b.length()>=0 && a.length()>=b.length()){
            for(int i=0; i<a.length();i++){
                result.append(a.charAt(i));
                if(b.length()>i){
                    result.append(b.charAt(i));
                }
            }
        }   else if(a.length()>=0 && b.length()>=0 && b.length()>a.length()){
            for(int i=0; i<b.length();i++){
                if(a.length()>i){
                    result.append(a.charAt(i));
                }
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }
    }
