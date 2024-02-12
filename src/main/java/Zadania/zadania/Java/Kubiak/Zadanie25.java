package Zadania.zadania.Java.Kubiak;

/*Napisz program, w którym użytkownik zgaduje losową liczbę
        z przedziału od 0 do 9 generowaną przez komputer.*/

import java.util.Random;
import java.util.Scanner;

public class Zadanie25 {
    public static void main(String[] args) {

    ZgadnijLiczbe();

    }
    public static void ZgadnijLiczbe(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(true){
            int wylosowanaLiczba = random.nextInt(7);
            System.out.println("Podaj liczbę od 0 do 6");
            int wybranaLiczba = scanner.nextInt();
            counter++;
            if(wybranaLiczba==wylosowanaLiczba){
                System.out.println("Zgadłeś liczbę: " + wybranaLiczba + " za: " + counter + " razem" );
                break;
            }
            if(counter==10){
                System.out.println("Niestety ale nie ogadłeś liczby");
                break;
            }
        }

    }
}
