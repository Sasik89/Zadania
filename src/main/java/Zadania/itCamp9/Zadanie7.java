package Zadania.itCamp9;

//stworz tabele 10 elementową z wylosowanych w przedziale od 0 do 100 liczb tak by wylosowana liczba była podzielna przez 7

import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            while(true){
                int a = random.nextInt(0,101);
                if(a%7==0) {
                    tablica[i]=a;
                    break;
                }
            }
        }
        for(int element:tablica){
            System.out.print(element + " ");
        }
    }
}