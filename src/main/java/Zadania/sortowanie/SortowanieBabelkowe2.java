package Zadania.sortowanie;

import java.util.Random;

public class SortowanieBabelkowe2 {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        boolean zamiana = true;
        int max = 9;
        while (zamiana) {
            zamiana = false;
            for (int i = 0; i < max; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    zamiana = true;
                }
            }
            max--;
        }
        for(int element : tab){
            System.out.print(element + " ");
        }

    }
}
