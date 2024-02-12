package Zadania.Zadania2903;

/* Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
 Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowanych.
 Przykład:
       3, 5, 12, 34, 45
       45, 21, 65, 23, 1
      3, 5, 12, 34, 45, 45, 21, 65, 23, 1.*/

import java.util.Random;

public class Zadanie7 {

    // TODO: 15.01.2024 Działa
    
    public static void main(String[] args) {

    TablicaOdwrotnie();
    
    }
    public static void TablicaOdwrotnie() {
        Random random = new Random();
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        int[] tablicaSuma = new int[tablica1.length + tablica2.length];
        for (int i = 0; i < 10; i++) {
            tablica1[i] = random.nextInt(100);
            tablica2[i] = random.nextInt(100);
            }

        for(int i = 0; i<(tablica1.length + tablica2.length);i++){
            if(i<=9){
                tablicaSuma[i] = tablica1[i];
            } 
            if(i>9 && i <=19) {
                tablicaSuma[i] = tablica2[i-10];
            }
        }
        for(int i = 0; i<tablica1.length; i++) {
            System.out.print(tablica1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<tablica2.length; i++) {
            System.out.print(tablica2[i] + " ");

        }
        System.out.println();
        for(int i = 0; i<tablicaSuma.length; i++){
            System.out.print(tablicaSuma[i] + " ");
        }
        }
    }

