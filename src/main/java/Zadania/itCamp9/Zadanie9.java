package Zadania.itCamp9;

/*Napisz program w ktorym zmienna "w" oznacza wysokość choinki. Program
 * wyswietla na ekranie wypisana choinke o danej wysokosci*/

import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {

   // choinka(8);

    choinkaZBabkami(8);

    }

    public static void choinka(int w) {
        int k = 1;
        while (w >= 1) {
            for (int i = w; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
            w--;
            k = k +2;
            }
        }

    public static void choinkaZBabkami(int w) {
        Random random = new Random();
        int k = 1;
        while (w >= 1) {
            for (int i = w; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                int a = random.nextInt(0,5);
                if(a == 4){
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            w--;
            k = k +2;
        }
    }
    }
