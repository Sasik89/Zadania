package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

//Mamy listę liczb. Policz średnią tylo parzystych.

import java.util.Arrays;
import java.util.List;

public class Zadanie2 {


    public static void main(String[] args) {

        List<Integer> liczby = Arrays.asList(3,5,7,12,2,6,7,2,23,57,86,3,1);

        Metoda1(liczby);
        Metoda2(liczby);


    }
    //Tradycyjnie pętlą
    public static void Metoda1(List<Integer> lista){
        double suma = 0;
        double counter = 0;
        for(double element : lista){
            if(element%2==0){
                suma= suma+element;
                counter++;
            }
        }
        System.out.println(suma/counter);
    }
    //Srumień
    public static void Metoda2(List<Integer> lista){
        double liczba = lista.stream().filter(i->i%2==0).mapToDouble(i->i).average().getAsDouble(); //zamiana mapToDouble pozwoliła na skorzystanie z metody average().
        System.out.println(liczba);
    }

}
