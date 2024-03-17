package Zadania.coodingbat.string2;


/*Return true if the string "cat" and "dog" appear the same number of times in the given string.
        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true*/
public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

    }
    public static boolean catDog(String str) {
        if(counter(str,"cat")==counter(str,"dog")){
            return true;
        }
        return false;
    }

    public static int counter(String str, String reg){
        int counter = 0;
        for(int i=0; i<str.length()-2;i++){
            if(str.substring(i,i+3).contains(reg)){
                counter++;
            }
        }
        return counter;
    }
}
