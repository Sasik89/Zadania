//policz średnią przy pomocy strumienia

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,8);

    //policz sume licz parzystych oraz średnia

        int sum = 0;
        int evenCounter = 0;

        for (int element : list) {
            if(element % 2 == 0){
                sum += element;
                evenCounter++;
            }
        }
        double avg = (double) (sum/evenCounter);
        System.out.println(avg);


    //liczenie średniej przy pomoc strumienia

    OptionalDouble avgBox = list.stream()
            .filter(i -> i % 2 == 0)
            .mapToInt(i -> i)
            .average();

        System.out.println(avgBox.getAsDouble());

}
}
