package Zadania.wielowatkowosc.szukaniemin;

import java.util.ArrayList;
import java.util.List;

public class App3 {  //algorytm do testowania liczby wątków
    public static List<Integer> partiaResult = new ArrayList<>();

    public static void main(String[] args) {
        int[] tab = new int[100000000];
        int threadsNumber = 4; //liczba wątków
        Thread[] threads = new Thread[threadsNumber];

        long startTime = System.currentTimeMillis();

        for(int i = 0; i< threadsNumber; i++){
            threads[i] = new Thread(
                    new MinFinderForApp3(tab, i* (tab.length/threadsNumber),
                            (i+1) *(tab.length/threadsNumber)));
            threads[i].start();
        }

        try{
            for (Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Zepsuło się");
        }


        int globalMin = partiaResult.get(0);
        for (int element: partiaResult) {
            if(element<globalMin){
                globalMin = element;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(globalMin);
        System.out.println(endTime-startTime);

    }
}
