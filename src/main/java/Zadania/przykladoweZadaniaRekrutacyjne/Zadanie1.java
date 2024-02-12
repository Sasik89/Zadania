package Zadania.przykladoweZadaniaRekrutacyjne;

/*Wypisz liczby od 1 do 100, jeżeli liczba jest podzielna przez 3 to wypisz Fizz,
        jeżeli podzielna przez 5 to Buzz, jeżeli podzielna przez 3 i 5 to wypisz FizzBuzz.
        W przeciwnym wypadku wypisz liczbę.*/

public class Zadanie1 {
    public static void main(String[] args) {


        for(int i = 1; i<=100; i++){
            if(i%5 == 0 && i%3 == 0){
                System.out.println(i + " Fizz Bazz");
            }
            else if(i%5 == 0){
                System.out.println(i + " Bazz");
            }
            else if(i%5 != 0 && i%3 == 0){
                System.out.println(i + " Fizz");
            }
        }
    }
}
