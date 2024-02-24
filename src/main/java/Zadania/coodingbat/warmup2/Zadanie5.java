package Zadania.coodingbat.warmup2;

/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
Biorąc pod uwagę ciąg, zwróć nowy ciąg składający się z co drugiego znaku, zaczynając od pierwszego, więc „Hello” daje „Hlo”.
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"*/

public class Zadanie5 {
    public static void main(String[] args) {

        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));

    }
    public static String stringBits(String str) {
        int liczbaZnakow = str.length();
        char[] tablica = str.toCharArray();
        String result = "";
        for(int i = 0; i<liczbaZnakow; i=i+2){
            result = result + tablica[i];
        }
        return result;
    }

}
