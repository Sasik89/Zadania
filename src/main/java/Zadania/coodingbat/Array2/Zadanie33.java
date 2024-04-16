package Zadania.coodingbat.Array2;

/*This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
(See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end,
so for example start=1 and end=5 gives the series 1, 2, 3, 4.
Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number,
for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
In Java, String.valueOf(xxx) will make the String form of an int or other type.
This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing,
and we vary the start/end instead of just always doing 1..100.
        fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
        fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie33 {
    public static void main(String[] args) {

        wyswietlacz(fizzBuzz(1,6));
        wyswietlacz(fizzBuzz(1,8));
        wyswietlacz(fizzBuzz(1,11));

    }
    public static String[] fizzBuzz(int start, int end) {
        List<String> result = new ArrayList<>();
        for(int i = start; i<end; i++){
            if(i%15==0){
                result.add("FizzBuzz");
            } else if(i%5==0){
                result.add("Buzz");
            } else if(i%3==0){
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result.stream().toArray(String[]::new);
    }
    public static void wyswietlacz(String[] tab) {
        for (String element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
