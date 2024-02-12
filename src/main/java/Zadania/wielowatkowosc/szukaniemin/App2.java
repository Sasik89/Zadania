package Zadania.wielowatkowosc.szukaniemin;

import java.util.ArrayList;
import java.util.List;

public class App2 { //sprawdzenie ile szybciej działa aplikacja na 4 wątkach
    public final static List<Integer> partiaResult = new ArrayList<>();

    public static void main(String[] args) {
        int[] tab = new int[100000000];
        int threads = 4;  //liczba wątków


        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new MinFinderForApp3(tab, 0, 20000000));
        Thread t2 = new Thread(new MinFinderForApp3(tab, 25000000, 50000000));
        Thread t3 = new Thread(new MinFinderForApp3(tab, 50000000, 75000000));
        Thread t4 = new Thread(new MinFinderForApp3(tab, 75000000, 100000000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
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
