package Zadania.sortowanie;

import java.util.Random;

public class SortowanieBabelkowe {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        boolean zamiana = true;
        while (zamiana) {
            zamiana = false;
            for (int i = 0; i < 9; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    zamiana = true;
                }
            }
        }
        for(int element : tab){
            System.out.print(element + " ");
        }

    }
}
