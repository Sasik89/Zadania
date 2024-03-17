package Zadania.coodingbat.string2;

/*Return the number of times that the string "hi" appears anywhere in the given string.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2*/

public class Zadanie2 {
    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

    }
    public static int countHi(String str) {
        int counter = 0;
        if(str.length()<2){
            return 0;
        } else {
            for(int i=0; i<str.length()-1;i++){
                if(str.substring(i,i+2).contains("hi")){
                    counter++;
                }
            }
        }
        return counter;
    }

}
