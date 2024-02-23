package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

/*
Stwórz listę stringów (10 dowolnych stringów), napisz program
który wyświeli jaka jest średnia dlugosc strinków które nie
zawieraja spacji i wielkich lister po usunieciu se stringow kropek
i przecinków
 */

import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {

        List<String> lista = List.of("sad","Janusz", "do minik"
                , "janusz.malinowski", "wiesiek", "Czesiek", "ia.a");

        metoda1(lista);


    }

    public static void metoda1(List<String> lista){
        double avg = lista.stream()
                .filter(s->s.equals(s.toLowerCase()))
                .filter(s->!s.contains(" "))
                .map(s->s.replaceAll("[.,]", ""))
                .mapToInt(s->s.length())
                .average().getAsDouble();
        System.out.println(avg);
    }

}


