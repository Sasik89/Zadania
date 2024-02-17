package Zadania.coodingbat.warmup1;


/*Return true if the given string contains between 1 and 3 'e' chars.
        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false*/


public class Zadanie26 {
    public static void main(String[] args) {

        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));

    }
    public static boolean stringE(String str) {
        char[] tablica = str.toCharArray();
        int counter = 0;
        for(char element : tablica){
            if(element == 'e'){
                counter++;
            }
        }
        if(counter>=1 && counter<=3){
            return true;
        } else {
            return false;
        }
    }


}
