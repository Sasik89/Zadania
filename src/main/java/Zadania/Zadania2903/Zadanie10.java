package Zadania.Zadania2903;

/* Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
 Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
 Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta.
 Jak sprawdzić czy z podanych boków da się zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".*/

//a<b+c, b<a+c. c<a+b

import java.util.Scanner;

public class Zadanie10 {

    // TODO: 16.01.2024 Działa 
    
    public static void main(String[] args) {

        NierownoscTrojkata();

    }

    public static int[] wprowadzenieLiczb(){
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[3];
        System.out.println("Wprowadź wartość boku a");
        tablica[0] = scanner.nextInt();
        System.out.println("Wprowadź wartość boku b");
        tablica[1] = scanner.nextInt();
        System.out.println("Wprowadź wartość boku b");
        tablica[2] = scanner.nextInt();
        return tablica;
    }

    public static void wyswietlacz(boolean zmienna){
        if(zmienna == true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean SprawdzanieNierownosci(int[] tablica){
        int a = tablica[0];
        int b = tablica[1];
        int c = tablica[2];
        return b < (a + c) && c < (a + b) && a < (b + c);
    }
    
    public static void NierownoscTrojkata(){
        wyswietlacz(SprawdzanieNierownosci(wprowadzenieLiczb()));
    }
}
