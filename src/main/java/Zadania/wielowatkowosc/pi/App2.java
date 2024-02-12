package Zadania.wielowatkowosc.pi;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public final static List<Integer> partialResult = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        int allPoints = 100000000;
        long startTime = System.currentTimeMillis();
        int threadsNumber = 4;
        Thread[] threads = new Thread[threadsNumber];

        for(int i = 0; i <threadsNumber; i++){
            threads[i] = new Thread(new PointsGenerator(allPoints/threadsNumber));
            threads[i].start();
        }

        for(Thread thread : threads){
            thread.join();
        }

        int pointsInCircleSum = 0;
        for(int element : partialResult){
            pointsInCircleSum+=element;
        }
        double pi = 4.0 * pointsInCircleSum / allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime-startTime);

    }
}
