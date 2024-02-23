package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

/* Mamy listę intów, szukamy tylko większych od 3 i mniejszych od 10
nie interesują na duplikaty, chcemy pominąć pierwsze 3 liczby,
chcemy dostać pierwsząliczbę spełniajacą warunek
 */


import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,5,6,13,7,8,9,2,6,2,13,15);
        Mateoda(list);

    }
    public static void Mateoda(List<Integer> lista){
        int result = lista.stream()
                .distinct()
                .filter(i->i>3)
                .filter(i->i<10)
                .skip(3)
                .findFirst().get();
        System.out.println(result);
    }

}
