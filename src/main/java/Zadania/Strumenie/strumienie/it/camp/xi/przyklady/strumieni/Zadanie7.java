package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

import java.util.List;

public class Zadanie7 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

    }
    public static void metoda(List<Integer> lista){

        lista.stream()
                .peek(System.out::println)
                .filter(i-> i>3)
                .peek(System.out::println)
                .filter(i->i<8)
                .peek(System.out::println)
                .limit(1)
                .forEach(System.out::println);

        //strumein w tym przypadku bieże każdą liczbę i przepycha ją przez filtry,
        //okazuje się że niektóre liczby w ogole nie są poddawana operacjom.
    }
}
