package Zadania.sortowanie;

import java.util.Random;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {

        int[] tab = new int[20];
        int[] tablicaDoZliczen = new int[100];
        int[] tablicaWynikowa = new int[tab.length];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        for(int i = 0; i < tablicaDoZliczen.length; i++){
            for (int k : tab) {
                if (k == i) {
                    tablicaDoZliczen[i] = tablicaDoZliczen[i] + 1;
                }
            }
        }
        System.out.println();
        for(int element : tablicaDoZliczen){
            System.out.print(element + " ");
        }

        for(int i = 0; i<tablicaWynikowa.length; i++) {
            boolean flaga = true;
            while (flaga) {
                for (int j = 0; j < tablicaDoZliczen.length; j++) {
                    if (tablicaDoZliczen[j] > 0) {
                        tablicaWynikowa[i] = j;
                        tablicaDoZliczen[j] = tablicaDoZliczen[j] - 1;
                    flaga = false;
                        break;
                    }
                }
            }
        }
        System.out.println();
        for(int element : tablicaWynikowa){
            System.out.print(element + " ");
        }
    }

}
