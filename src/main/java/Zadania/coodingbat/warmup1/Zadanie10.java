package Zadania.coodingbat.warmup1;

/*Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.

Mając dany ciąg, powiemy, że jego przód to pierwsze 3 znaki ciągu.
Jeśli długość struny jest mniejsza niż 3, przód jest tym, co tam jest.
Zwróć nowy ciąg, który jest 3 kopiami przodu.

        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc"*/

public class Zadanie10 {
    public static void main(String[] args) {

      System.out.println(front3("Java"));
      System.out.println(front3("Chocolate"));
      System.out.println(front3("abc"));
      System.out.println(front3("ab"));

    }
    public static String front3(String str) {
        String str2;
        if(str.length()==0){
            return "";
        } else if (str.length()==2) {
            str2 = str.substring(0,2);
        } else if (str.length()==1) {
            str2 = str.substring(0,1);
        } else {
            str2 = str.substring(0,3);
        }
        String result = "";
        for(int i = 0; i<3; i++){
            result = str2 + result;
        }
        return result;
    }

}
