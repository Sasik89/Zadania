package Zadania.wielowatkowosc.szukaniemin;

import java.util.Random;

public class MinFinderForApp3 implements Runnable {

    private int[] tab;
    private int startIndex;
    private int endIndex;

    public MinFinderForApp3(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = startIndex; i < endIndex; i++) {
            tab[i] = random.nextInt();
        }
        int min = tab[startIndex];
        for (int i = this.startIndex; i < this.endIndex; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        synchronized (App3.partiaResult) {
            App3.partiaResult.add(min);
        }
    }
}
