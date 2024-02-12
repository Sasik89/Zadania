//Przetwórz kilka strumieni

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class Zadanie6 {





          public static void main (String[]args){
            List<List<Integer>> list = Arrays.asList(
                    Arrays.asList(1, 2, 3),
                    Arrays.asList(4, 5, 6),
                    Arrays.asList(7, 8, 9)
            );

            //przetwarza kilka strumieni

            list.stream().flatMap(Collection::stream)
                    .forEach(x -> System.out.print(x + ","));
        }
    }

