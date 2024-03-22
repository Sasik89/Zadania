package Zadania.coodingbat.string3;


/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day1y fez")); //day y fez
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("DAY abc XYZ"));

    }
    public static int countYZ(String str) {
        int count = 0;
        int start = 0; //wartość indeksu litery która w substring bedzie wykorzystana jako parametr do tworzenia słowa;
        List<String> result = new ArrayList<>();
        char[] result2 = str.toCharArray();

        //pętla do wyodrębniania slów z Stringa które składają się tylko i wyłącznie z liter czyli z "day1y fez" robi "day" "y" oraz "fez"

        for(int i=0; i<str.length();i++){
            if(!Character.isLetter(result2[i]) && i<str.length()){ //jeśli litera nie jest literą! oraz nie jest ostatnim znakiem w Stringu wóczas dodaj do tabeli, a
                result.add(str.substring(start,i));
                start=i+1;
            }
            if(str.length()-1==i && Character.isLetter(result2[i])){
                result.add(str.substring(start,i+1));
            }
        }

        for(String element : result){
            if(element.toLowerCase().endsWith("y") || element.toLowerCase().endsWith("z")){
                count++;
            }
        }
        return count;
    }
}
